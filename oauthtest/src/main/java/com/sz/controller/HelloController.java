package com.sz.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/admin/hello")
    public String admin(){
        return "Hello Admin!";
    }

    @GetMapping("/user/hello")
    public String user(){
        return "Hello User!";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
}
