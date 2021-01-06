package com.sz.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SangInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String,String> info = new HashMap<>();
        info.put("name","hcniu");
        info.put("email","809477146@qq.com");
        builder.withDetail("author2",info);
    }
}
