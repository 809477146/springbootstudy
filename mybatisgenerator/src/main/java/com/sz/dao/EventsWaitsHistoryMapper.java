package com.sz.dao;

import com.sz.model.EventsWaitsHistory;

public interface EventsWaitsHistoryMapper {
    int insert(EventsWaitsHistory record);

    int insertSelective(EventsWaitsHistory record);
}