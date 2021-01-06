package com.sz.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(Integer userid){
        System.out.println("insert:"+userid);
        return "user";
    }

    public void deleteUserById(Integer userid){
        System.out.println("delete:"+userid);
    }
}
