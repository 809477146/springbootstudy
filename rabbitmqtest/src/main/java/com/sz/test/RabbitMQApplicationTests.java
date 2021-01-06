package com.sz.test;

import com.sz.config.RabbitFanoutConfig;
import com.sz.config.RabbitHeaderConfig;
import com.sz.config.RabbitTopicConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void directTest(){
        rabbitTemplate.convertAndSend("hello-queue","hello direct!");
    }

    /**
     * 这里发送消息时不需要routingkey，指定exchange即可，routingkey可以直接传一个null
     * 所有与FanoutExchange绑定的Queue都会收到消息
     */
    @Test
    public void fanoutTest(){
        rabbitTemplate.convertAndSend(RabbitFanoutConfig.FANOUTNAME,null,"hello fanout!");
    }

    @Test
    public void topicTest(){
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"xiaomi.news","小米新闻。。。");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"huawei.news","华为新闻。。。");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"xiaomi.phone","小米手机。。。");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"huawei.phone","华为手机。。。");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,"phone.news","手机新闻。。。");
    }

    @Test
    public void headerTest(){
        Message nameMsg = MessageBuilder.withBody("hello header！ name-queue".getBytes())
                .setHeader("name","sang").build();
        Message ageMsg = MessageBuilder.withBody("hello header! age-queue".getBytes())
                .setHeader("age",19).build();
        rabbitTemplate.send(RabbitHeaderConfig.HEADERNAME,null,ageMsg);
        rabbitTemplate.send(RabbitHeaderConfig.HEADERNAME,null,nameMsg);
    }
}
