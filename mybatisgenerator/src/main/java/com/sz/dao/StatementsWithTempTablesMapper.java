package com.sz.dao;

import com.sz.model.StatementsWithTempTablesWithBLOBs;

public interface StatementsWithTempTablesMapper {
    int insert(StatementsWithTempTablesWithBLOBs record);

    int insertSelective(StatementsWithTempTablesWithBLOBs record);
}