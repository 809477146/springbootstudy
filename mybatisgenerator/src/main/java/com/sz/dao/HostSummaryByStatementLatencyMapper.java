package com.sz.dao;

import com.sz.model.HostSummaryByStatementLatencyWithBLOBs;

public interface HostSummaryByStatementLatencyMapper {
    int insert(HostSummaryByStatementLatencyWithBLOBs record);

    int insertSelective(HostSummaryByStatementLatencyWithBLOBs record);
}