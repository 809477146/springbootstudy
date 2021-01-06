package com.sz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduledtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledtestApplication.class, args);
    }

}
