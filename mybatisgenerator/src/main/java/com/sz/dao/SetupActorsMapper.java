package com.sz.dao;

import com.sz.model.SetupActors;

public interface SetupActorsMapper {
    int insert(SetupActors record);

    int insertSelective(SetupActors record);
}