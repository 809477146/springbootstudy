package com.sz.dao;

import com.sz.model.PreparedStatementsInstances;

public interface PreparedStatementsInstancesMapper {
    int insert(PreparedStatementsInstances record);

    int insertSelective(PreparedStatementsInstances record);
}