package com.sz.controller;

import com.sz.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class UserAopTestController {

    @Autowired
    UserService userService;

    @GetMapping("/get")
    public String getUserById(Integer userid){
        String result = userService.getUserById(userid);
        return result;
    }

    @GetMapping("/delete")
    public String deleteUserById(Integer userid){
        userService.deleteUserById(userid);
        return "用户编号："+userid+"删除成功";
    }

}
