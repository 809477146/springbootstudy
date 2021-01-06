package com.sz.dao;

import com.sz.model.SocketSummaryByEventName;

public interface SocketSummaryByEventNameMapper {
    int insert(SocketSummaryByEventName record);

    int insertSelective(SocketSummaryByEventName record);
}