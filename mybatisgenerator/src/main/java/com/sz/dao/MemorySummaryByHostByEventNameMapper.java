package com.sz.dao;

import com.sz.model.MemorySummaryByHostByEventName;

public interface MemorySummaryByHostByEventNameMapper {
    int insert(MemorySummaryByHostByEventName record);

    int insertSelective(MemorySummaryByHostByEventName record);
}