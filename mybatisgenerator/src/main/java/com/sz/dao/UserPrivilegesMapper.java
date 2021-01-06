package com.sz.dao;

import com.sz.model.UserPrivileges;

public interface UserPrivilegesMapper {
    int insert(UserPrivileges record);

    int insertSelective(UserPrivileges record);
}