package com.sz.controller;

import com.sz.entity.Book;
import com.sz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/bookOps")
    public void bookOps() {
        Book b1 = new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实甫");
        int i = bookService.insert(b1);
        System.out.println("insert>>" + i);
        Book b2 = new Book();
        b2.setId(1);
        b2.setName("朝花夕拾");
        b2.setAuthor("鲁迅");
        int updateBook = bookService.updateByPrimaryKey(b2);
        System.out.println("updateBook>>" + updateBook);
        Book b3 = bookService.selectByPrimaryKey(1);
        System.out.println("selectByPrimaryKey>>" + b3);
        int delete = bookService.deleteByPrimaryKey(2);
        System.out.println("deleteByPrimaryKey>>" + delete);
        List<Book> allBooks = bookService.selectAll();
        System.out.println("selectAll>>" + allBooks);
    }
}
