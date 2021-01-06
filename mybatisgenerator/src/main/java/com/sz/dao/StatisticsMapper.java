package com.sz.dao;

import com.sz.model.Statistics;

public interface StatisticsMapper {
    int insert(Statistics record);

    int insertSelective(Statistics record);
}