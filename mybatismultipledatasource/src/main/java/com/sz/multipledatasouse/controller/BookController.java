package com.sz.multipledatasouse.controller;

import com.sz.multipledatasouse.entity.Book;
import com.sz.multipledatasouse.mapper1.BookMapper1;
import com.sz.multipledatasouse.mapper2.BookMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookMapper1 bookMapper1;

    @Autowired
    BookMapper2 bookMapper2;

    @GetMapping("/test1")
    public void test1(){
        List<Book> books1 = bookMapper1.getAllBooks();
        List<Book> books2 = bookMapper2.getAllBooks();
        System.out.println("books1:"+books1);
        System.out.println("books2:"+books2);
    }

}
