package com.sz.dao;

import com.sz.model.FileInstances;

public interface FileInstancesMapper {
    int insert(FileInstances record);

    int insertSelective(FileInstances record);
}