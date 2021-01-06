package com.sz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * 自定义类WebSocketConfig继承自WebSocketMessageBrokerConfigurer 进行WebSocket配置，
 * 然后通过＠EnableWebSocketMessageBroker 注解开启 WebSocket 消息代理
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        /*
            表示设置消息代理的前缀， 即如果消息的前缀是"/topic" 就会将消息转发给消息代理（broker)，
            再由消息代理将消息广播给当前连接的客户端。
         */
        registry.enableSimpleBroker("/topic","/queue");
        /*
            表示配置一个或多个前缀，通过这些前缀过滤出需要被注解方法处理的消息。
            例如，前缀为"/app"的destination可以通过＠MessageMapping注解的方法处理，
            而其他 destination（例如"/topic" "/queue"）将被直接交给broker处理。
         */
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /*
            表示定义一个前缀为"/chat"的endPoint，并开启sockjs支持，
            sockjs可以解决浏览器对WebSocket的兼容性问题，客户端将通过这里配置的URL来建立WebSocket连接
         */
        registry.addEndpoint("/chat").withSockJS();
    }
}
