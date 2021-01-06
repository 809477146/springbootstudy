package com.sz.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 在RabbitMQ中，所有的消息生产者提交的消息都会交由Exchange进行再分配，
 * Exchange会根据不同的策略将消息分发到不同的Queue中。RabbitMQ中一共提供了4种不同的Exchange策略，
 * 分别是Direct、Fanout、Topic以及Header，这4种不同的策略中，前3种的使用频率较高，第4种的使用频率较低
 *
 * DirectExchange的路由策略是将消息队列绑定到一个DirectExchange上，
 * 当一条消息到达DirectExchange时会被转发到与该条消息routing key相同的Queue上，
 * 例如消息队列名为"hello-queue"，则routingkey为"hello-queue"的消息会被该消息队列接收。
 *
 * DirectExchange和Binding两个Bean的配置可以省略掉，
 * 即如果使用DirectExchange，只配置一个Queue的实例即可。
 */
@Configuration
public class RabbitDirectConfig {
    public final static String DIRECTNAME = "sang-direct";

    /**
     * 首先提供一个消息队列 Queue.
     * 然后创建一个DirectExchange对象，三个参数分别是名字、重启后是否依然有效、长期未用时是否删除。
     */
    @Bean
    Queue queue(){
        return new Queue("hello-queue");
    }
    @Bean
    DirectExchange directExchange(){
        return new DirectExchange(DIRECTNAME, true, false);
    }

    /**
     * 创建一个Binding对象，将Exchange和Queue绑定在一起
     * @return
     */
    @Bean
    Binding binging(){
        return BindingBuilder.bind(queue()).to(directExchange()).with("direct");
    }
}
