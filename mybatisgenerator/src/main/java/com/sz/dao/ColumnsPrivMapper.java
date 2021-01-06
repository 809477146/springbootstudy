package com.sz.dao;

import com.sz.model.ColumnsPriv;
import com.sz.model.ColumnsPrivKey;

public interface ColumnsPrivMapper {
    int deleteByPrimaryKey(ColumnsPrivKey key);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    ColumnsPriv selectByPrimaryKey(ColumnsPrivKey key);

    int updateByPrimaryKeySelective(ColumnsPriv record);

    int updateByPrimaryKey(ColumnsPriv record);
}