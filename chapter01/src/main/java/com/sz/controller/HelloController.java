package com.sz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class HelloController {

    @GetMapping("/hello01")
    public String hello01(){
        return "111111";
    }
}
