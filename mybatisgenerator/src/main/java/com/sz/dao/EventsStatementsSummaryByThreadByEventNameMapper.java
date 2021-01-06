package com.sz.dao;

import com.sz.model.EventsStatementsSummaryByThreadByEventName;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    int insert(EventsStatementsSummaryByThreadByEventName record);

    int insertSelective(EventsStatementsSummaryByThreadByEventName record);
}