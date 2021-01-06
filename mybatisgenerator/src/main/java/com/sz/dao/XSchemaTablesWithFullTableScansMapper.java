package com.sz.dao;

import com.sz.model.XSchemaTablesWithFullTableScans;

public interface XSchemaTablesWithFullTableScansMapper {
    int insert(XSchemaTablesWithFullTableScans record);

    int insertSelective(XSchemaTablesWithFullTableScans record);
}