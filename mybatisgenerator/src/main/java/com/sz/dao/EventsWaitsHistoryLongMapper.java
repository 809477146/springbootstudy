package com.sz.dao;

import com.sz.model.EventsWaitsHistoryLong;

public interface EventsWaitsHistoryLongMapper {
    int insert(EventsWaitsHistoryLong record);

    int insertSelective(EventsWaitsHistoryLong record);
}