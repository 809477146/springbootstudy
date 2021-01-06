package com.sz.dao;

import com.sz.model.EventsWaitsSummaryByInstance;

public interface EventsWaitsSummaryByInstanceMapper {
    int insert(EventsWaitsSummaryByInstance record);

    int insertSelective(EventsWaitsSummaryByInstance record);
}