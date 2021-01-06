package com.sz.dao;

import com.sz.model.CondInstances;

public interface CondInstancesMapper {
    int insert(CondInstances record);

    int insertSelective(CondInstances record);
}