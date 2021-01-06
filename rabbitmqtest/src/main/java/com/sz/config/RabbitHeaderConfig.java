package com.sz.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * HeadersExchange是一种使用较少的路由策略，HeadersExchange会根据消息的Header将消息路由到不同的Queue上，这种策略也和routingkey无关
 *
 */
@Configuration
public class RabbitHeaderConfig {
    public final static String HEADERNAME = "sang-header";

    @Bean
    HeadersExchange headersExchange(){
        return new HeadersExchange(HEADERNAME, true, false);
    }

    @Bean
    Queue queueName(){
        return new Queue("name-queue");
    }

    @Bean
    Queue queueAge(){
        return new Queue("age-queue");
    }

    /**
     * whereAny表示消息的Header中只要有一个Header匹配上map中的 key/value，
     * 就把该消息路由到名为“name-queue”的Queue上，这里也可以使用 whereAll方法，
     * 表示消息的所有Header都要匹配。whereAny和whereAll实际上对应了一个名为 x-match的属性。
     * @return
     */
    @Bean
    Binding bindingName(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","sang");
        return BindingBuilder.bind(queueName())
                .to(headersExchange()).whereAny(map).match();
    }

    /**
     * 只要消息的Header中包含age，无论age的值是多少，都将消息路由到名为“age-queue”的Queue上
     * @return
     */
    @Bean
    Binding bindingAge(){
        return BindingBuilder.bind(queueAge())
                .to(headersExchange()).where("age").exists();
    }

}
