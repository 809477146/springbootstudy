package com.sz.dao;

import com.sz.model.Events;

public interface EventsMapper {
    int insert(Events record);

    int insertSelective(Events record);
}