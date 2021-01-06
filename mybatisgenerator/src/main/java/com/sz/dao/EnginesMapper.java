package com.sz.dao;

import com.sz.model.Engines;

public interface EnginesMapper {
    int insert(Engines record);

    int insertSelective(Engines record);
}