package com.sz.dao;

import com.sz.model.SchemaTableStatisticsWithBLOBs;

public interface SchemaTableStatisticsMapper {
    int insert(SchemaTableStatisticsWithBLOBs record);

    int insertSelective(SchemaTableStatisticsWithBLOBs record);
}