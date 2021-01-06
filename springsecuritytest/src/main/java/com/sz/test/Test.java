package com.sz.test;

import com.sz.service.RegService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    RegService service;

    @org.junit.Test
    public void test(){
        service.reg("admin","123");
        service.reg("sang","123");
        service.reg("root","123");
    }




}
