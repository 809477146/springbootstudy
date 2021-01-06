package com.sz.devtoolsandunittesting.test;

import com.sz.devtoolsandunittesting.entity.Book;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@JsonTest
public class MyJsonTest {
    @Autowired
    JacksonTester<Book> jacksonTester;

    @Test
    /**
     * JSON序列化
     */
    public void testSerialize() throws IOException {
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setId(2);
        Assertions.assertThat(jacksonTester.write(book)).isEqualToJson("./book.json");//判断序列化结果是否是所期待的json  book.json是一个定义在当前包的JSON文件
        Assertions.assertThat(jacksonTester.write(book)).hasJsonPathStringValue("@.name");//判断对象序列化之后生成的JSON中是否包含一个名为name的key
        Assertions.assertThat(jacksonTester.write(book)).extractingJsonPathStringValue("@.name").isEqualTo("三国演义");//判断序列化之后name对应的值是否为三国演义
    }

    @Test
    /**
     * JSON反序列化
     */
    public void testDeserialize() throws Exception{
        String content = "{\"name\": \"三国演义\",\"author\": \"罗贯中\",\"id\": 1}";
        Assertions.assertThat(jacksonTester.parseObject(content).getName()).isEqualTo("三国演义");
    }

}
