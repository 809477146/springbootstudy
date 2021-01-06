package com.sz.dao;

import com.sz.model.EventsTransactionsHistoryLong;

public interface EventsTransactionsHistoryLongMapper {
    int insert(EventsTransactionsHistoryLong record);

    int insertSelective(EventsTransactionsHistoryLong record);
}