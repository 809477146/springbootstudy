package com.sz.dao;

import com.sz.model.SchemaUnusedIndexes;

public interface SchemaUnusedIndexesMapper {
    int insert(SchemaUnusedIndexes record);

    int insertSelective(SchemaUnusedIndexes record);
}