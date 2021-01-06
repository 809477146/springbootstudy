package com.sz.dao;

import com.sz.model.SchemaIndexStatisticsWithBLOBs;

public interface SchemaIndexStatisticsMapper {
    int insert(SchemaIndexStatisticsWithBLOBs record);

    int insertSelective(SchemaIndexStatisticsWithBLOBs record);
}