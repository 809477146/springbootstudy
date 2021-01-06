package com.sz.dao;

import com.sz.model.EventsTransactionsHistory;

public interface EventsTransactionsHistoryMapper {
    int insert(EventsTransactionsHistory record);

    int insertSelective(EventsTransactionsHistory record);
}