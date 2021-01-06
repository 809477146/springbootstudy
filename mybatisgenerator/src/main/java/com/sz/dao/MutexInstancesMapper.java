package com.sz.dao;

import com.sz.model.MutexInstances;

public interface MutexInstancesMapper {
    int insert(MutexInstances record);

    int insertSelective(MutexInstances record);
}