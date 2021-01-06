package com.sz.dao;

import com.sz.model.Event;
import com.sz.model.EventKey;
import com.sz.model.EventWithBLOBs;

public interface EventMapper {
    int deleteByPrimaryKey(EventKey key);

    int insert(EventWithBLOBs record);

    int insertSelective(EventWithBLOBs record);

    EventWithBLOBs selectByPrimaryKey(EventKey key);

    int updateByPrimaryKeySelective(EventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventWithBLOBs record);

    int updateByPrimaryKey(Event record);
}