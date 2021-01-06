package com.sz.dao;

import com.sz.model.Db;
import com.sz.model.DbKey;

public interface DbMapper {
    int deleteByPrimaryKey(DbKey key);

    int insert(Db record);

    int insertSelective(Db record);

    Db selectByPrimaryKey(DbKey key);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}