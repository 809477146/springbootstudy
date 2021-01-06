package com.sz.dao;

import com.sz.model.GlobalVariables;

public interface GlobalVariablesMapper {
    int insert(GlobalVariables record);

    int insertSelective(GlobalVariables record);
}