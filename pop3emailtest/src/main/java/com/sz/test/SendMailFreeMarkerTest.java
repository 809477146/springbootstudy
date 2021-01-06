package com.sz.test;

import com.sz.Pop3emailtestApplication;
import com.sz.entity.User;
import com.sz.service.MailService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.StringWriter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMailFreeMarkerTest {
    @Autowired
    MailService mailService;

    /**
     * 首先配置FreeMarker模板位置，配置模板文件，然后结合User对象渲染模板，将渲染结果发送出去
     */
    @Test
    public void sendHtmlMail(){
        try {
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_0);
            ClassLoader loader = Pop3emailtestApplication.class.getClassLoader();
            configuration.setClassLoaderForTemplateLoading(loader, "ftl");
            Template template = configuration.getTemplate("mailtemplate.ftl");
            StringWriter mail = new StringWriter();
            User user = new User();
            user.setUsername("祥哥");
            user.setGender("人妖");
            template.process(user,mail);
            mailService.sendHtmlMail("809477146@qq.com",
                    "3250480014@qq.com",
                    "测试邮件主题",
                    mail.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
