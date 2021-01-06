package com.sz.mongodbtest.test;

import com.sz.mongodbtest.dao.BookDao;
import com.sz.mongodbtest.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookTest1 {

    @Autowired
    BookDao bookDao;

    @Test
    public void test(){
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("朝花夕拾");
        b1.setAuthor("鲁迅");
        books.add(b1);
        Book b2 = new Book();
        b2.setId(2);
        b2.setName("呐喊");
        b2.setAuthor("鲁迅");
        books.add(b2);
        bookDao.insert(books);
        List<Book> books1 = bookDao.findByAuthorContains("鲁迅");
        System.out.println(books1);
        Book book = bookDao.findByNameEquals("朝花夕拾");
        System.out.println(book);
    }
}
