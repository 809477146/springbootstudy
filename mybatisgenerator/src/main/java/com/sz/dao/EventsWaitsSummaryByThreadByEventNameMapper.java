package com.sz.dao;

import com.sz.model.EventsWaitsSummaryByThreadByEventName;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    int insert(EventsWaitsSummaryByThreadByEventName record);

    int insertSelective(EventsWaitsSummaryByThreadByEventName record);
}