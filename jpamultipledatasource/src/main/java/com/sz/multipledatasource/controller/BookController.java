package com.sz.multipledatasource.controller;


import com.sz.multipledatasource.entity.Book;
import com.sz.multipledatasource.service.BookService1;
import com.sz.multipledatasource.service.BookService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService1 bookService1;

    @Autowired
    BookService2 bookService2;

    @GetMapping("/test1")
    public void test1(){
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("西游记");
        book.setPrice(24F);
        bookService1.save(book);

        Book book2 = new Book();
        book2.setAuthor("罗贯中2");
        book2.setName("西游记2");
        book2.setPrice(242F);
        bookService2.save(book2);

    }

}
