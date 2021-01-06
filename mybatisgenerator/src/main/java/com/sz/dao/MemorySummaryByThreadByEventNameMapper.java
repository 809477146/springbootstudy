package com.sz.dao;

import com.sz.model.MemorySummaryByThreadByEventName;

public interface MemorySummaryByThreadByEventNameMapper {
    int insert(MemorySummaryByThreadByEventName record);

    int insertSelective(MemorySummaryByThreadByEventName record);
}