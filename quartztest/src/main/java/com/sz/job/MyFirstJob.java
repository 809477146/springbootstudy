package com.sz.job;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Job 可以是一个普通的 JavaBean，如果是普通的JavaBean，
 * 那么可以先添加＠Component 注解 将之注册到 Spring 容器中。
 */
@Component
public class MyFirstJob {
    public void sayHello(){
        System.out.println("MyFirstJob:sayHello:"+new Date());
    }
}
