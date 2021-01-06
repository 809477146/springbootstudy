package com.sz.dao;

import com.sz.model.XInnodbBufferStatsBySchema;

public interface XInnodbBufferStatsBySchemaMapper {
    int insert(XInnodbBufferStatsBySchema record);

    int insertSelective(XInnodbBufferStatsBySchema record);
}