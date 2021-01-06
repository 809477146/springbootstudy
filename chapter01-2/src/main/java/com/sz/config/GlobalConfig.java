package com.sz.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sang on 2018/7/11.
 */
@ControllerAdvice
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String,String> userInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", "罗贯中");
        map.put("gender", "男");
        return map;
    }

    @ModelAttribute(value = "info2")
    public Map<String,String> userInfo2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", "罗贯中1");
        map.put("gender", "男1");
        return map;
    }
}
