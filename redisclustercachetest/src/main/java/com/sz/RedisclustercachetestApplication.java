package com.sz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisclustercachetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisclustercachetestApplication.class, args);
    }

}
