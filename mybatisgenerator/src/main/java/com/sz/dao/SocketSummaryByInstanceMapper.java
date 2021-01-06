package com.sz.dao;

import com.sz.model.SocketSummaryByInstance;

public interface SocketSummaryByInstanceMapper {
    int insert(SocketSummaryByInstance record);

    int insertSelective(SocketSummaryByInstance record);
}