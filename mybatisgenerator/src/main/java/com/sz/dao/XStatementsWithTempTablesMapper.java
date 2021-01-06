package com.sz.dao;

import com.sz.model.XStatementsWithTempTables;

public interface XStatementsWithTempTablesMapper {
    int insert(XStatementsWithTempTables record);

    int insertSelective(XStatementsWithTempTables record);
}