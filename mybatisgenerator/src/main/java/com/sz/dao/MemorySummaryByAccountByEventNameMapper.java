package com.sz.dao;

import com.sz.model.MemorySummaryByAccountByEventName;

public interface MemorySummaryByAccountByEventNameMapper {
    int insert(MemorySummaryByAccountByEventName record);

    int insertSelective(MemorySummaryByAccountByEventName record);
}