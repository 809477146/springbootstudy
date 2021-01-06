package com.sz.dao;

import com.sz.model.GtidExecuted;
import com.sz.model.GtidExecutedKey;

public interface GtidExecutedMapper {
    int deleteByPrimaryKey(GtidExecutedKey key);

    int insert(GtidExecuted record);

    int insertSelective(GtidExecuted record);

    GtidExecuted selectByPrimaryKey(GtidExecutedKey key);

    int updateByPrimaryKeySelective(GtidExecuted record);

    int updateByPrimaryKey(GtidExecuted record);
}