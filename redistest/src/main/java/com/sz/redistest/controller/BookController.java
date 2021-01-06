package com.sz.redistest.controller;

import com.sz.redistest.entity.Book;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test1")
    public void test1(){
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("name","三国演义");
        String name = ops1.get("name");
        System.out.println("name="+name);

        ValueOperations ops2 = redisTemplate.opsForValue();
        Book b = new Book();
        b.setId(1);
        b.setName("红楼梦");
        b.setAuthor("曹雪芹");
        ops2.set("book",b);
        Book book = (Book) ops2.get("book");
        System.out.println("book="+book);
    }
}
