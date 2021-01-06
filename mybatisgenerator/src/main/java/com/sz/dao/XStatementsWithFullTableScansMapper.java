package com.sz.dao;

import com.sz.model.XStatementsWithFullTableScans;

public interface XStatementsWithFullTableScansMapper {
    int insert(XStatementsWithFullTableScans record);

    int insertSelective(XStatementsWithFullTableScans record);
}