package com.sz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.List;

@Component
public class MailService {
    /**
     * JavaMailSender是SpringBoot在MailSenderPropertiesConfiguration类中配直好的，
     * 该类在Mail自动配直类MailSenderAutoConfiguration中导入，因此这里注入JavaMailSender就可以使用了 。
     */
    @Autowired
    JavaMailSender javaMailSender;

    /**
     * 简单邮件可以直接构建一个SimpleMailMessage对象进行配直，JavaMailSender将邮件发送出去．
     * @param from 邮件发送者
     * @param to 收件人
     * @param cc 抄送人
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    public void sendSimpleMail(String from,String to,String cc,String subject,String content){
        SimpleMailMessage simpMsg = new SimpleMailMessage();
        simpMsg.setFrom(from);
        simpMsg.setTo(to);
        if(!StringUtils.isEmpty(cc)){
            simpMsg.setCc(cc);
        }
        simpMsg.setSubject(subject);
        simpMsg.setText(content);
        javaMailSender.send(simpMsg);
    }

    /**
     * 发送带附件的邮件
     * 这里使用MimeMessageHelper简化了邮件配置，它的构造方法的第二个参数true表示构造一个multipart message类型的邮件，
     * multipart message类型的邮件包含多个正文、附件以及内嵌资源，邮件的表现形式更加丰富。最后通过addAttachment方法添加附件。
     * @param from
     * @param to
     * @param subject
     * @param content
     * @param files
     */
    public void sendAttachFileMail(String from,String to,String subject,String content, List<File> files){
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content);
            for(File file : files){
                helper.addAttachment(file.getName(),file);
            }
            javaMailSender.send(message);
        }
        catch(MessagingException e){
            e.printStackTrace();
        }
    }

    /**
     * 在发送邮件时分别传入图片资源路径和资源id，通过FileSystemResource构造静态资源，
     * 然后调用addlnline方法将资源加入邮件对象中。注意，在调用MimeMessageHelper中的setText方法时，
     * 第二个参数true表示邮件正文是HTML格式的，该参数不传默认为false 。
     * @param from
     * @param to
     * @param subject
     * @param content
     * @param srcPath
     * @param resIds
     */
    public void sendMailWithImg(String from,String to,String subject,String content,
                                String[] srcPath,String[] resIds){
        if (srcPath.length != resIds.length){
            System.out.println("发送失败！");
            return;
        }

        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            for (int i = 0;i < srcPath.length;i++){
                FileSystemResource res = new FileSystemResource(new File(srcPath[i]));
                helper.addInline(resIds[i],res);
            }
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


    /**
     * 对于格式复杂的邮件，如果采用字符串进行HTML拼接，不但容易出错，而且不易于维护，
     * 使用HTML模板可以很好地解决这一问题。使用 FreeMarker 构建邮件模板
     * @param from
     * @param to
     * @param subject
     * @param content
     */
    public void sendHtmlMail(String from,String to, String subject,String content){
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            System.out.println("发送失败！");
            e.printStackTrace();
        }
    }

}
