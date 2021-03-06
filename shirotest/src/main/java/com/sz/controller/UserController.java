package com.sz.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    /**
     * 在 doLogin方法中，首先构造一个 UsernamePasswordToken 实例，然后获取一个 Subject对象并调用该对象中的login方法执行登录操作，
     * 在登录操作执行过程中，当有异常抛出时，说明登录失败，携带错误信息返回登录视图；当登录成功时，则重定向到“／index" .
     * @param username
     * @param password
     * @param model
     * @return
     */
    @PostMapping("/doLogin")
    public String doLogin(String username, String password, Model model){
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        }catch (AuthenticationException e){
            model.addAttribute("error","用户名或密码输入错误！");
            return "login";
        }
        return "redirect:/index";
    }

    /**
     * 具备admin角色才能访问
     * @return
     */
    @RequiresRoles("admin")
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    /**
     * 具备admin或者user角色即可访问
     * @return
     */
    @RequiresRoles(value = {"admin","user"},logical = Logical.OR)
    @GetMapping("/user")
    public String user(){
        return "user";
    }
}
