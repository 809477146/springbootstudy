package com.sz.dao;

import com.sz.model.EventsStagesHistoryLong;

public interface EventsStagesHistoryLongMapper {
    int insert(EventsStagesHistoryLong record);

    int insertSelective(EventsStagesHistoryLong record);
}