package com.sz.dao;

import com.sz.model.EventsTransactionsCurrent;

public interface EventsTransactionsCurrentMapper {
    int insert(EventsTransactionsCurrent record);

    int insertSelective(EventsTransactionsCurrent record);
}