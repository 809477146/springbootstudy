package com.sz.dao;

import com.sz.model.XSchemaTableStatisticsWithBuffer;

public interface XSchemaTableStatisticsWithBufferMapper {
    int insert(XSchemaTableStatisticsWithBuffer record);

    int insertSelective(XSchemaTableStatisticsWithBuffer record);
}