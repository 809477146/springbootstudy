package com.sz.test;


import com.sz.config.JmsComponent;
import com.sz.entity.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveMqTest {
    @Autowired
    JmsComponent jmsComponent;

    @Test
    public void contextLoads(){
        Message msg = new Message();
        msg.setContent("Hello Jms!");
        msg.setDate(new Date());
        jmsComponent.send(msg);
    }
}
