package com.sz.dao;

import com.sz.model.Hosts;

public interface HostsMapper {
    int insert(Hosts record);

    int insertSelective(Hosts record);
}