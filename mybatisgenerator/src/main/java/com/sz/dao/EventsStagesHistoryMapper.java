package com.sz.dao;

import com.sz.model.EventsStagesHistory;

public interface EventsStagesHistoryMapper {
    int insert(EventsStagesHistory record);

    int insertSelective(EventsStagesHistory record);
}