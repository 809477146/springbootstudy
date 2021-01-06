package com.sz.dao;

import com.sz.model.InnodbBufferStatsByTableWithBLOBs;

public interface InnodbBufferStatsByTableMapper {
    int insert(InnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(InnodbBufferStatsByTableWithBLOBs record);
}