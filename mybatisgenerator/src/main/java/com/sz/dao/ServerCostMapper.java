package com.sz.dao;

import com.sz.model.ServerCost;

public interface ServerCostMapper {
    int deleteByPrimaryKey(String costName);

    int insert(ServerCost record);

    int insertSelective(ServerCost record);

    ServerCost selectByPrimaryKey(String costName);

    int updateByPrimaryKeySelective(ServerCost record);

    int updateByPrimaryKey(ServerCost record);
}