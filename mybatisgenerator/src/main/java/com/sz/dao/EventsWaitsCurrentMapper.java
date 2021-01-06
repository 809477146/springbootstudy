package com.sz.dao;

import com.sz.model.EventsWaitsCurrent;

public interface EventsWaitsCurrentMapper {
    int insert(EventsWaitsCurrent record);

    int insertSelective(EventsWaitsCurrent record);
}