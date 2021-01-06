package com.sz.dao;

import com.sz.model.EventsTransactionsSummaryGlobalByEventName;

public interface EventsTransactionsSummaryGlobalByEventNameMapper {
    int insert(EventsTransactionsSummaryGlobalByEventName record);

    int insertSelective(EventsTransactionsSummaryGlobalByEventName record);
}