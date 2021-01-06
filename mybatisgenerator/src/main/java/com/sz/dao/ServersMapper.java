package com.sz.dao;

import com.sz.model.Servers;

public interface ServersMapper {
    int deleteByPrimaryKey(String serverName);

    int insert(Servers record);

    int insertSelective(Servers record);

    Servers selectByPrimaryKey(String serverName);

    int updateByPrimaryKeySelective(Servers record);

    int updateByPrimaryKey(Servers record);
}