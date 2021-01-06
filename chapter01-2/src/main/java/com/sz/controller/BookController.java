package com.sz.controller;

import com.sz.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public ModelAndView books(){
        List<Book> books = new ArrayList<>();
        Book bl = new Book();
        bl.setId(1);
        bl.setAuthor("罗贯中");
        bl.setName("三国演义");
        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("曹雪芹");
        b2.setName("红楼梦");
        books.add(bl);
        books.add(b2);
        ModelAndView model = new ModelAndView();
        model.addObject("books",books);
        model.setViewName("books");
        return model;
    }


}
