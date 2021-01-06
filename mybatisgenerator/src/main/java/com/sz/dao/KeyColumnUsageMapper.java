package com.sz.dao;

import com.sz.model.KeyColumnUsage;

public interface KeyColumnUsageMapper {
    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);
}