package com.sz.dao;

import com.sz.model.InnodbMetrics;

public interface InnodbMetricsMapper {
    int insert(InnodbMetrics record);

    int insertSelective(InnodbMetrics record);
}