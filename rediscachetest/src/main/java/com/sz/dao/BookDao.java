package com.sz.dao;

import com.sz.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "book_cache")//指明使用的缓存的名字（可选） 也可在@Cacheable注解中指明缓存名字
public class BookDao  {

    @Cacheable
    public Book getBookById(Integer id){
        System.out.println("getBookById");
        Book book = new Book();
        book.setId(id);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        return book;
    }

    @CachePut(key = "#book.id")
    public Book updateBook(Book book){
        System.out.println("updateBook");
        book.setName("三国演义2");
        return book;
    }

    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookById");
    }

}

