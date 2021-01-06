package com.sz.dao;

import com.sz.model.Metrics;

public interface MetricsMapper {
    int insert(Metrics record);

    int insertSelective(Metrics record);
}