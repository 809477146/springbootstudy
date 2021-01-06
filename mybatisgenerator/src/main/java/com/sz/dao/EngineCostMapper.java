package com.sz.dao;

import com.sz.model.EngineCost;
import com.sz.model.EngineCostKey;

public interface EngineCostMapper {
    int deleteByPrimaryKey(EngineCostKey key);

    int insert(EngineCost record);

    int insertSelective(EngineCost record);

    EngineCost selectByPrimaryKey(EngineCostKey key);

    int updateByPrimaryKeySelective(EngineCost record);

    int updateByPrimaryKey(EngineCost record);
}