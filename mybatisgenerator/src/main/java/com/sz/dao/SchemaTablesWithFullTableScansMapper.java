package com.sz.dao;

import com.sz.model.SchemaTablesWithFullTableScans;

public interface SchemaTablesWithFullTableScansMapper {
    int insert(SchemaTablesWithFullTableScans record);

    int insertSelective(SchemaTablesWithFullTableScans record);
}