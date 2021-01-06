package com.sz.dao;

import com.sz.model.HostSummaryByStatementTypeWithBLOBs;

public interface HostSummaryByStatementTypeMapper {
    int insert(HostSummaryByStatementTypeWithBLOBs record);

    int insertSelective(HostSummaryByStatementTypeWithBLOBs record);
}