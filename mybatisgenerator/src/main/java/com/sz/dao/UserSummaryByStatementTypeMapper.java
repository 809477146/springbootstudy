package com.sz.dao;

import com.sz.model.UserSummaryByStatementTypeWithBLOBs;

public interface UserSummaryByStatementTypeMapper {
    int insert(UserSummaryByStatementTypeWithBLOBs record);

    int insertSelective(UserSummaryByStatementTypeWithBLOBs record);
}