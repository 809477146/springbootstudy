package com.sz.dao;

import com.sz.model.EventsWaitsSummaryByAccountByEventName;

public interface EventsWaitsSummaryByAccountByEventNameMapper {
    int insert(EventsWaitsSummaryByAccountByEventName record);

    int insertSelective(EventsWaitsSummaryByAccountByEventName record);
}