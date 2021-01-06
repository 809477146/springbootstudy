package com.sz.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/services")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "sss";
    }


    @GetMapping("/hello2")
    public void hello2(Model model){
        Map<String, Object> map = model.asMap();
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println("key:"+key+"  value:"+value);
        }

    }
}
