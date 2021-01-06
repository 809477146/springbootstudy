package com.sz.dao;

import com.sz.model.RwlockInstances;

public interface RwlockInstancesMapper {
    int insert(RwlockInstances record);

    int insertSelective(RwlockInstances record);
}