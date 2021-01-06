package com.sz.test;

import com.sz.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMailThymeleafTest {
    @Autowired
    MailService mailService;
    @Autowired
    TemplateEngine templateEngine;

    @Test
    public void sendHtmlMailThymeleaf(){
        Context ctx = new Context();
        ctx.setVariable("username","祥哥");
        ctx.setVariable("gender","人妖");
        String mail = templateEngine.process("mailtemplate.html",ctx);
        mailService.sendHtmlMail("809477146@qq.com",
                "3250480014@qq.com",
                "测试邮件主题",
                mail);

    }
}
