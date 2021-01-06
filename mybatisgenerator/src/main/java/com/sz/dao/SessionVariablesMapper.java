package com.sz.dao;

import com.sz.model.SessionVariables;

public interface SessionVariablesMapper {
    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);
}