package com.sz.dao;

import com.sz.model.SchemaTableStatisticsWithBufferWithBLOBs;

public interface SchemaTableStatisticsWithBufferMapper {
    int insert(SchemaTableStatisticsWithBufferWithBLOBs record);

    int insertSelective(SchemaTableStatisticsWithBufferWithBLOBs record);
}