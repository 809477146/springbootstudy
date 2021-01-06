package com.sz.devtoolsandunittesting.test;

import com.sz.devtoolsandunittesting.service.HelloService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
    @Autowired
    HelloService helloService;

    @Test
    public void contextLoads(){
        String hello = helloService.sayHello("Michael");
        Assert.assertThat(hello, Matchers.is("Hello Michael !"));
    }
}
