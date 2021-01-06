package com.sz.dao;

import com.sz.model.TablesPriv;
import com.sz.model.TablesPrivKey;

public interface TablesPrivMapper {
    int deleteByPrimaryKey(TablesPrivKey key);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    TablesPriv selectByPrimaryKey(TablesPrivKey key);

    int updateByPrimaryKeySelective(TablesPriv record);

    int updateByPrimaryKey(TablesPriv record);
}