package com.sz.dao;

import com.sz.model.StatementsWithFullTableScansWithBLOBs;

public interface StatementsWithFullTableScansMapper {
    int insert(StatementsWithFullTableScansWithBLOBs record);

    int insertSelective(StatementsWithFullTableScansWithBLOBs record);
}