package com.sz.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutReceiver {
    @RabbitListener(queues = "queue-one")
    public void hander1(String msg){
        System.out.println("FanoutReceiver:handler1:"+msg);
    }

    @RabbitListener(queues = "queue-two")
    public void hander2(String msg){
        System.out.println("FanoutReceiver:handler2:"+msg);
    }
}
