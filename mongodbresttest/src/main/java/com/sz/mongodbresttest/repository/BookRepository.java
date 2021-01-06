package com.sz.mongodbresttest.repository;

import com.sz.mongodbresttest.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//没有Controller可在Repository上直接加CrossOrigin注解或者使用全局配置来实现跨域
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
// 未加注解之前是以实体类小写加上s 如http://localhost:8080/books  加上注解之后books改为path的值
// 查询返回list时  list在json中的键改为collectionResourceRel的值
// 若不想这个仓库的方法暴露  即不能在浏览器通过url访问 可在注解中增加exported=false
@RepositoryRestResource(path = "bs",collectionResourceRel = "bs",itemResourceRel = "b")
public interface BookRepository extends MongoRepository<Book,Integer> {
    @RestResource(path = "author") //没加注解时url中search后面的参数是方法名   加了之后方法名改为path的值
    List<Book> findByAuthorContains(@Param("author") String author);

    // 若不想某个方法暴露 可在方法的注解中增加exported=false
    @RestResource(path = "name")
    Book findByNameEquals(@Param("name") String name);
}
