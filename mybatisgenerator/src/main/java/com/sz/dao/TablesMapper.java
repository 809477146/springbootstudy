package com.sz.dao;

import com.sz.model.Tables;

public interface TablesMapper {
    int insert(Tables record);

    int insertSelective(Tables record);
}