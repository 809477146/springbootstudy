package com.sz.dao;

import com.sz.model.SchemaTableLockWaitsWithBLOBs;

public interface SchemaTableLockWaitsMapper {
    int insert(SchemaTableLockWaitsWithBLOBs record);

    int insertSelective(SchemaTableLockWaitsWithBLOBs record);
}