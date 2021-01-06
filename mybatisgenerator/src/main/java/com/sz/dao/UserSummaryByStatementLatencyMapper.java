package com.sz.dao;

import com.sz.model.UserSummaryByStatementLatencyWithBLOBs;

public interface UserSummaryByStatementLatencyMapper {
    int insert(UserSummaryByStatementLatencyWithBLOBs record);

    int insertSelective(UserSummaryByStatementLatencyWithBLOBs record);
}