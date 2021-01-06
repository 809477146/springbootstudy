package com.sz.dao;

import com.sz.model.SchemaAutoIncrementColumns;

public interface SchemaAutoIncrementColumnsMapper {
    int insert(SchemaAutoIncrementColumns record);

    int insertSelective(SchemaAutoIncrementColumns record);
}