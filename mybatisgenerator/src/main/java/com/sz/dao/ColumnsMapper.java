package com.sz.dao;

import com.sz.model.ColumnsWithBLOBs;

public interface ColumnsMapper {
    int insert(ColumnsWithBLOBs record);

    int insertSelective(ColumnsWithBLOBs record);
}