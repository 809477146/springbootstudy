package com.sz.dao;

import com.sz.model.XInnodbBufferStatsByTableWithBLOBs;

public interface XInnodbBufferStatsByTableMapper {
    int insert(XInnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(XInnodbBufferStatsByTableWithBLOBs record);
}