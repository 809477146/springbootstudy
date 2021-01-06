package com.sz.dao;

import com.sz.model.EventsTransactionsSummaryByUserByEventName;

public interface EventsTransactionsSummaryByUserByEventNameMapper {
    int insert(EventsTransactionsSummaryByUserByEventName record);

    int insertSelective(EventsTransactionsSummaryByUserByEventName record);
}