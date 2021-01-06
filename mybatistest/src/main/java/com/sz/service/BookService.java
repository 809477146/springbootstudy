package com.sz.service;

import com.sz.entity.Book;
import com.sz.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public int deleteByPrimaryKey(Integer id){
        return bookMapper.deleteByPrimaryKey(id);
    }

    public int insert(Book record){
        return bookMapper.insert(record);
    }

    public Book selectByPrimaryKey(Integer id){
        return bookMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKey(Book record){
        return bookMapper.updateByPrimaryKey(record);
    }

    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }





}
