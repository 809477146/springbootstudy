package com.sz.dao;

import com.sz.model.EventsStatementsCurrentWithBLOBs;

public interface EventsStatementsCurrentMapper {
    int insert(EventsStatementsCurrentWithBLOBs record);

    int insertSelective(EventsStatementsCurrentWithBLOBs record);
}