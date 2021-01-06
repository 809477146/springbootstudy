package com.sz.dao;

import com.sz.model.EventsStatementsSummaryByAccountByEventName;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    int insert(EventsStatementsSummaryByAccountByEventName record);

    int insertSelective(EventsStatementsSummaryByAccountByEventName record);
}