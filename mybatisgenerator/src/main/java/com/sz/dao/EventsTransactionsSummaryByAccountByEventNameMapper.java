package com.sz.dao;

import com.sz.model.EventsTransactionsSummaryByAccountByEventName;

public interface EventsTransactionsSummaryByAccountByEventNameMapper {
    int insert(EventsTransactionsSummaryByAccountByEventName record);

    int insertSelective(EventsTransactionsSummaryByAccountByEventName record);
}