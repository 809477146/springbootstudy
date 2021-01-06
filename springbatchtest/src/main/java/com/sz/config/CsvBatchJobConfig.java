package com.sz.config;

import com.sz.entity.User;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

/**
 * 创建CsvBatchJobConfig进行Spring Batch配置，同时注入JobBuilderFactory、StepBuilderFactory
 * 以及DataSource备用，其中JobBuilderFactory将用来构建Job,StepBuilderFactory用来构建Step,
 * DataSource则用来支持持久化操作，这里持久化方案是Spring-Jdbc
 */
@Configuration
public class CsvBatchJobConfig {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;
    @Autowired
    DataSource dataSource;

    /**
     * 配置一个ItemReader, Spring Batch提供了一些常用的ItemReader，
     * 例如JdbcPagingItemReader用来读取数据库中的数据，
     * StaxEventItemReader用来读取XML数据，本案例中的FlatFileItemReader则是一个加载普通文件的ItemReader。
     * 在FlatFileItemReader的配置过程中，由于data.csv文件第一行是标题，
     * 因此通过setLinesToSkip方法设直跳过一行，然后通过setResource方法配置data.csv文件的位置，
     * 笔者的data.csv文件放在classpath目录下，然后通过setLineMapper方法设置每一行的数据信息，
     * setNames方法配直了data.csv文件一共有4列，分别是id、usemame、address以及gender,
     * setDelimiter则是配直列与列之间的问隔符（将通过间隔符对每一行的数据进行切分），
     *
     * 最后设置要映射的实体类属性即可。
     * @return
     */
    @Bean
    @StepScope
    FlatFileItemReader<User> itemReader(){
        FlatFileItemReader<User> reader = new FlatFileItemReader<User>();
        reader.setLinesToSkip(1);
        reader.setResource(new ClassPathResource("data.csv"));
        reader.setLineMapper(new DefaultLineMapper<User>(){
            {
                setLineTokenizer(new DelimitedLineTokenizer(){
                    {
                        setNames("id","username","address","gender");
                        setDelimiter("|");
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<User>(){
                    {
                        setTargetType(User.class);
                    }
                });
            }
        });
        return reader;
    }

    /**
     * 配置ItemWriter，即数据的写出逻辑，Spring Batch也提供了多个ItemWriter的实现，
     * 常见的如FlatFileItemWriter，表示将数据写出为一个普通文件，
     * StaxEventItemWriter表示将数据写出为XML。另外，还有针对不同数据库提供的写出操作支持类，
     * 如 MongoItemWriter、 JpaItemWriter、 Neo4jItemWriter 以及HibernateItemWriter等，
     * 本案例使用的 JdbcBatchItemWriter 则是通过 JDBC 将数据写出到一个关系型数据库中。
     * JdbcBatchItemWriter主要配置数据以及数据插入SQL，注意占住符的写法是 ":属性名"。
     * 最后通过BeanPropertyItemSqlParameterSourceProvider实例将实体类的属性和SQL中的占住符一一映射。
     * @return
     */
    @Bean
    JdbcBatchItemWriter jdbcBatchItemWriter(){
        JdbcBatchItemWriter writer = new JdbcBatchItemWriter();
        writer.setDataSource(dataSource);
        writer.setSql("insert into user(id,username,address,gender) values (:id,:username,:address,:gender)");
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<User>());
        return writer;
    }

    /**
     * 配置一个 Step, Step 通过 stepBuilderFactory 进行配置，首先通过 get获取一个StepBuilder,
     * get方法的参数就是该 Step的name，然后调用chunk方法的参数 2，表示每读
     * 取到两条数据就执行一次write操作， 最后分别配置 reader 和 writer.
     * @return
     */
    @Bean
    Step csvStep(){
        return stepBuilderFactory.get("csvStep")
                .<User, User>chunk(2)
                .reader(itemReader())
                .writer(jdbcBatchItemWriter())
                .build();
    }

    /**
     * 配置一个 Job，通过jobBuilderFactory构建一个Job,get方法的参数为Job的name, 然后配置该Job的Step即可。
     * @return
     */
    @Bean
    Job csvJob(){
        return jobBuilderFactory.get("csvJob")
                .start(csvStep())
                .build();
    }
}
