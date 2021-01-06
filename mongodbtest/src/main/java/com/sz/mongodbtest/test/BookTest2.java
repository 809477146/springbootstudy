package com.sz.mongodbtest.test;

import com.sz.mongodbtest.dao.BookDao;
import com.sz.mongodbtest.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookTest2 {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void test(){
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(3);
        b1.setName("宋诗选注");
        b1.setAuthor("钱钟书");
        books.add(b1);
        Book b2 = new Book();
        b2.setId(4);
        b2.setName("围城");
        b2.setAuthor("钱钟书");
        books.add(b2);
        mongoTemplate.insertAll(books);
        List<Book> books1 = mongoTemplate.findAll(Book.class);
        System.out.println(books1);
        Book book = mongoTemplate.findById(3,Book.class);
        System.out.println(book);
    }
}
