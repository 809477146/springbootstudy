package com.sz.dao;

import com.sz.model.XSchemaIndexStatistics;

public interface XSchemaIndexStatisticsMapper {
    int insert(XSchemaIndexStatistics record);

    int insertSelective(XSchemaIndexStatistics record);
}