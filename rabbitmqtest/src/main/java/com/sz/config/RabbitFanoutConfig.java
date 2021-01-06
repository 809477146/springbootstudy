package com.sz.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FanoutExchange的数据交换策略是把所有到达FanoutExchange的消息转发给所有与它绑定的Queue，
 * 在这种策略中，routingkey将不起任何作用，
 *
 * 首先创建 FanoutExchange，三个参数分别是名字、重启后是否依然有效、长期未用时是否删除。
 * 然后创建两个Queue，再将这两个 Queue都绑定到FanoutExchange上
 */
@Configuration
public class RabbitFanoutConfig {
    public final static String FANOUTNAME = "sang-fanout";
    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange(FANOUTNAME, true, false);
    }

    @Bean
    Queue queueOne(){
        return new Queue("queue-one");
    }

    @Bean
    Queue queueTwo(){
        return new Queue("queue-two");
    }

    @Bean
    Binding bindingOne(){
        return BindingBuilder.bind(queueOne()).to(fanoutExchange());
    }

    @Bean
    Binding bindingTwo(){
        return BindingBuilder.bind(queueTwo()).to(fanoutExchange());
    }
}
