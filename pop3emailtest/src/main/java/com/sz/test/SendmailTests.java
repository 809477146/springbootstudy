package com.sz.test;

import com.sz.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendmailTests {
    @Autowired
    MailService mailService;

    @Test
    public void sendSimpleMail(){
        mailService.sendSimpleMail("809477146@qq.com",
                "1037439947@qq.com",
                "",
                "祥哥牛逼",
                "祥哥渣男");
    }

    @Test
    public void sendAttachFileMail(){
        List<File> files = new ArrayList<>();
        files.add(new File("C:\\Users\\Administrator\\Desktop\\学习文件\\MongoDB安装.txt"));
        files.add(new File("C:\\Users\\Administrator\\Desktop\\学习文件\\nginx负载均衡.txt"));
        mailService.sendAttachFileMail("809477146@qq.com",
                "3250480014@qq.com",
                "测试邮件主题",
                "测试邮件内容",
                files
                );
    }

    @Test
    public void sendMailWithImg(){
        String content = "<div>hello,这是一封带图片资源的邮件："+
                "这是图片1：<div><img src='cid:p01'/></div>"+
                "这是图片2：<div><img src='cid:p02'/></div>"+
                "</div>";
        String[] srcPaths = new String[]{"C:\\Users\\Administrator\\Desktop\\p01.jpg",
                "C:\\Users\\Administrator\\Desktop\\p02.jpg"};
        String[] resIds = new String[]{"p01","p02"};
        mailService.sendMailWithImg("809477146@qq.com",
                "3250480014@qq.com",
                "测试邮件主题(图片)",
                content,
                srcPaths,
                resIds
                );
    }





}
