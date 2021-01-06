package com.sz.config;

import com.sz.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * JmsMessagingTemplate是由Spring提供的一个JMS消息发送模板可以用来方便地进行消息的发送，
 * 消息发送方法convertAndSend的第一个参数是消息队列 ，第二个参数是消息内容，本案例演示一个对象消息。
 * ＠JmsListener注解则表示相应的方法是一个消息消费者，消息消费者订阅的消息destination为amq。
 */
@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate messagingTemplate;
    @Autowired
    Queue queue;

    public void send(Message msg){
        messagingTemplate.convertAndSend(this.queue,msg);
    }

    @JmsListener(destination = "amq")
    public void receive(Message msg){
        System.out.println("receive:"+msg);
    }
}
