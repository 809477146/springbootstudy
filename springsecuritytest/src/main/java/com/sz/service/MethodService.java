package com.sz.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class MethodService {

    @Secured("ROLE_ADMIN")//表示该方法需要ADMIN角色  这里需要在角色前加上ROLE_
    public String admin(){
        return "hello admin";
    }

    @PreAuthorize("hasRole('ADMIN') and hasRole('DBA')")
    public String dba(){
        return "hello dba";
    }

    @PreAuthorize("hasAnyRole('ADMIN','DBA','USER')")
    public String user(){
        return "hello user";
    }
}
