package com.sz.dao;

import com.sz.model.EventsWaitsSummaryByUserByEventName;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    int insert(EventsWaitsSummaryByUserByEventName record);

    int insertSelective(EventsWaitsSummaryByUserByEventName record);
}