package com.sz.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegService {

    public int reg(String username,String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String encodePassword = encoder.encode(password);
        return saveToDb(username,encodePassword);
    }

    /**
     * 保存用户名密码到数据库
     */
    private int saveToDb(String username, String encodePassword) {
        System.out.println(encodePassword);
        return 1;
    }

}
