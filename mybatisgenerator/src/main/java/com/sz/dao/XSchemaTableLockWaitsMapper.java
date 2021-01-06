package com.sz.dao;

import com.sz.model.XSchemaTableLockWaitsWithBLOBs;

public interface XSchemaTableLockWaitsMapper {
    int insert(XSchemaTableLockWaitsWithBLOBs record);

    int insertSelective(XSchemaTableLockWaitsWithBLOBs record);
}