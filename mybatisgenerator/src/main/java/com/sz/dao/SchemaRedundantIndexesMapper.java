package com.sz.dao;

import com.sz.model.SchemaRedundantIndexesWithBLOBs;

public interface SchemaRedundantIndexesMapper {
    int insert(SchemaRedundantIndexesWithBLOBs record);

    int insertSelective(SchemaRedundantIndexesWithBLOBs record);
}