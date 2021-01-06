package com.sz.dao;

import com.sz.model.XStatementAnalysis;

public interface XStatementAnalysisMapper {
    int insert(XStatementAnalysis record);

    int insertSelective(XStatementAnalysis record);
}