package com.sz.dao;

import com.sz.model.XSchemaFlattenedKeys;

public interface XSchemaFlattenedKeysMapper {
    int insert(XSchemaFlattenedKeys record);

    int insertSelective(XSchemaFlattenedKeys record);
}