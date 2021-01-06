package com.sz.dao;

import com.sz.model.EventsTransactionsSummaryByThreadByEventName;

public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    int insert(EventsTransactionsSummaryByThreadByEventName record);

    int insertSelective(EventsTransactionsSummaryByThreadByEventName record);
}