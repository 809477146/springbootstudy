package com.sz.dao;

import com.sz.model.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}