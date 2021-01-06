package com.sz.dao;

import com.sz.model.PartitionsWithBLOBs;

public interface PartitionsMapper {
    int insert(PartitionsWithBLOBs record);

    int insertSelective(PartitionsWithBLOBs record);
}