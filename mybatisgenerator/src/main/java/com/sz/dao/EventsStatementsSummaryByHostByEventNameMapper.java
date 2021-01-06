package com.sz.dao;

import com.sz.model.EventsStatementsSummaryByHostByEventName;

public interface EventsStatementsSummaryByHostByEventNameMapper {
    int insert(EventsStatementsSummaryByHostByEventName record);

    int insertSelective(EventsStatementsSummaryByHostByEventName record);
}