package com.sz.dao;

import com.sz.model.EventsStatementsHistoryLongWithBLOBs;

public interface EventsStatementsHistoryLongMapper {
    int insert(EventsStatementsHistoryLongWithBLOBs record);

    int insertSelective(EventsStatementsHistoryLongWithBLOBs record);
}