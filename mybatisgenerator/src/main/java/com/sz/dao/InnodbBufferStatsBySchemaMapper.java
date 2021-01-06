package com.sz.dao;

import com.sz.model.InnodbBufferStatsBySchemaWithBLOBs;

public interface InnodbBufferStatsBySchemaMapper {
    int insert(InnodbBufferStatsBySchemaWithBLOBs record);

    int insertSelective(InnodbBufferStatsBySchemaWithBLOBs record);
}