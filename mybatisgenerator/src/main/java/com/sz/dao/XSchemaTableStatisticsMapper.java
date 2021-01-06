package com.sz.dao;

import com.sz.model.XSchemaTableStatistics;

public interface XSchemaTableStatisticsMapper {
    int insert(XSchemaTableStatistics record);

    int insertSelective(XSchemaTableStatistics record);
}