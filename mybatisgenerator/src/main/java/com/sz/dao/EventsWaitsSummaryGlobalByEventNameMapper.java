package com.sz.dao;

import com.sz.model.EventsWaitsSummaryGlobalByEventName;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    int insert(EventsWaitsSummaryGlobalByEventName record);

    int insertSelective(EventsWaitsSummaryGlobalByEventName record);
}