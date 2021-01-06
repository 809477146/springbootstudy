package com.sz.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 首先创建 TopicExchange，三个参数分别是名字、重启后是否依然有效、长期未用时是否删除。
 * 然后创建三个Queue，第一个Queue用来存储和“xiaomi”有关的消息，
 * 第二个Queue用来存储和“huawei”有关的消息，
 * 第三个 Queue用来存储和“phone” 有关的消息。
 *
 * 将三个Queue分别绑定到TopicExchange上，
 * 第一个Binding中的"xiaomi.#"表示消息的routingkey凡是以“xiaomi”开头的，都将被路由到名称为“xiaomi”的Queue上；
 * 第二个Binding中的“huawei.#”表示消息的routingkey凡是以“huawei”开头的，都将被路由到名称为“huawei”的Queue上；
 * 第三个Binding中的"#.phone.#＂则表示消息的routingkey中凡是包含“phone”的，都将被路由到名称为“phone”的Queue上。
 */
@Configuration
public class RabbitTopicConfig {
    public final static String TOPICNAME = "sang-topic";

    @Bean
    TopicExchange topicExchange(){
        return new TopicExchange(TOPICNAME,true,false);
    }

    @Bean
    Queue xiaomi(){
        return new Queue("xiaomi",true);
    }

    @Bean
    Queue huawei(){
        return new Queue("huawei",true);
    }

    @Bean
    Queue phone(){
        return new Queue("phone",true);
    }

    @Bean
    Binding xiaomiBinding(){
        return BindingBuilder.bind(xiaomi()).to(topicExchange())
                .with("xiaomi.#");
    }

    @Bean
    Binding huaweiBinding(){
        return BindingBuilder.bind(huawei()).to(topicExchange())
                .with("huawei.#");
    }

    @Bean
    Binding phoneBinding(){
        return BindingBuilder.bind(phone()).to(topicExchange())
                .with("#.phone.#");
    }
}
