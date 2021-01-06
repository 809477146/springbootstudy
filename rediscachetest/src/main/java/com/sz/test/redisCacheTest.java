package com.sz.test;

import com.sz.dao.BookDao;
import com.sz.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class redisCacheTest {
    @Autowired
    BookDao bookDao;

    @Test
    public void test(){
        bookDao.getBookById(1);
        bookDao.getBookById(1);
        bookDao.deleteBookById(1);
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        Book b1 = bookDao.updateBook(book);
        System.out.println("b1: "+b1);
        Book b2 = bookDao.getBookById(1);
        System.out.println("b2: "+b2);
    }

}
