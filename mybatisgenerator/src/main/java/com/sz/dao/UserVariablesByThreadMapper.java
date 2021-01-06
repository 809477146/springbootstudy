package com.sz.dao;

import com.sz.model.UserVariablesByThread;

public interface UserVariablesByThreadMapper {
    int insert(UserVariablesByThread record);

    int insertSelective(UserVariablesByThread record);
}