package com.sz;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sz.mapper")
public class Chapter014Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter014Application.class, args);
    }

}
