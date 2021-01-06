package com.sz.multipledatasource.service;

import com.sz.multipledatasource.dao1.BookDao1;
import com.sz.multipledatasource.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService1 {

    @Autowired
    BookDao1 bookDao1;

    public void save(Book book){
        bookDao1.save(book);
    }
}
