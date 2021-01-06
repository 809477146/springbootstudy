package com.sz.dao;

import com.sz.model.EventsStatementsSummaryByUserByEventName;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    int insert(EventsStatementsSummaryByUserByEventName record);

    int insertSelective(EventsStatementsSummaryByUserByEventName record);
}