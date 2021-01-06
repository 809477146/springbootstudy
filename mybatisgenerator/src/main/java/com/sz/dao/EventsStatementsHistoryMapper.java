package com.sz.dao;

import com.sz.model.EventsStatementsHistoryWithBLOBs;

public interface EventsStatementsHistoryMapper {
    int insert(EventsStatementsHistoryWithBLOBs record);

    int insertSelective(EventsStatementsHistoryWithBLOBs record);
}