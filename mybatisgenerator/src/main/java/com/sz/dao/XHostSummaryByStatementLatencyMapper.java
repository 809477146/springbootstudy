package com.sz.dao;

import com.sz.model.XHostSummaryByStatementLatency;

public interface XHostSummaryByStatementLatencyMapper {
    int insert(XHostSummaryByStatementLatency record);

    int insertSelective(XHostSummaryByStatementLatency record);
}