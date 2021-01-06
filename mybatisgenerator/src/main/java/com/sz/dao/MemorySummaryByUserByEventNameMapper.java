package com.sz.dao;

import com.sz.model.MemorySummaryByUserByEventName;

public interface MemorySummaryByUserByEventNameMapper {
    int insert(MemorySummaryByUserByEventName record);

    int insertSelective(MemorySummaryByUserByEventName record);
}