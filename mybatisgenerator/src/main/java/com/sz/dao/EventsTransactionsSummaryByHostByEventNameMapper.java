package com.sz.dao;

import com.sz.model.EventsTransactionsSummaryByHostByEventName;

public interface EventsTransactionsSummaryByHostByEventNameMapper {
    int insert(EventsTransactionsSummaryByHostByEventName record);

    int insertSelective(EventsTransactionsSummaryByHostByEventName record);
}