package com.sz.multipledatasource.service;

import com.sz.multipledatasource.dao2.BookDao2;
import com.sz.multipledatasource.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService2 {

    @Autowired
    BookDao2 bookDao2;

    public void save(Book book){
        bookDao2.save(book);
    }
}
