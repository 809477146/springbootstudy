package com.sz.dao;

import com.sz.model.EventsStagesSummaryByHostByEventName;

public interface EventsStagesSummaryByHostByEventNameMapper {
    int insert(EventsStagesSummaryByHostByEventName record);

    int insertSelective(EventsStagesSummaryByHostByEventName record);
}