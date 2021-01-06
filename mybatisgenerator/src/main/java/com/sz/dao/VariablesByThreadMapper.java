package com.sz.dao;

import com.sz.model.VariablesByThread;

public interface VariablesByThreadMapper {
    int insert(VariablesByThread record);

    int insertSelective(VariablesByThread record);
}