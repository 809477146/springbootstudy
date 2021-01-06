package com.sz.dao;

import com.sz.model.EventsStagesSummaryByAccountByEventName;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    int insert(EventsStagesSummaryByAccountByEventName record);

    int insertSelective(EventsStagesSummaryByAccountByEventName record);
}