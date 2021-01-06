package com.sz.dao;

import com.sz.model.SetupObjects;

public interface SetupObjectsMapper {
    int insert(SetupObjects record);

    int insertSelective(SetupObjects record);
}