package com.sz.dao;

import com.sz.model.EventsWaitsSummaryByHostByEventName;

public interface EventsWaitsSummaryByHostByEventNameMapper {
    int insert(EventsWaitsSummaryByHostByEventName record);

    int insertSelective(EventsWaitsSummaryByHostByEventName record);
}