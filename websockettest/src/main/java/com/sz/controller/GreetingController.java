package com.sz.controller;

import com.sz.entity.Chat;
import com.sz.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class GreetingController {

    @Autowired
    SimpMessagingTemplate messagingTemplate;

    /**
     * 根据WebSocketConfig方法configureMessageBroker的registry.setApplicationDestinationPrefixes("/app")配置，
     * ＠MessageMapping("/hello")注解的方法将用来接收"/app/hello"路径发送来的消息，在注解方法中对消息进行处理后，
     * 再将消息转发到＠SendTo定义的路径上，而＠SendTo路径是一个前缀为 "/topic"的路径，
     * 因此该消息将被交给消息代理 broker，再由 broker 进行广播。
     * @param message
     * @return
     * @throws Exception
     */
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception{
        return message;
    }

    /**
     * 点对点消息
     * ＠MessageMapping("/chat")注解表示来自 "/app/chat"路径的消息将被 chat方法处理。
     * chat方法的第一个参数 Principal可以用来获取当前登录用户的信息，第二个参数则是客户端发送来的消息。
     * @param principal
     * @param chat
     */
    @MessageMapping("/chat")
    public void chat(Principal principal, Chat chat){
        String from = principal.getName();
        chat.setFrom(from);
        messagingTemplate.convertAndSendToUser(chat.getTo(),"/queue/chat",chat);
    }

}
