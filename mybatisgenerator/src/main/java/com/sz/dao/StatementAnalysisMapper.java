package com.sz.dao;

import com.sz.model.StatementAnalysisWithBLOBs;

public interface StatementAnalysisMapper {
    int insert(StatementAnalysisWithBLOBs record);

    int insertSelective(StatementAnalysisWithBLOBs record);
}