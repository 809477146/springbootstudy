package com.sz.dao;

import com.sz.model.HostCache;

public interface HostCacheMapper {
    int insert(HostCache record);

    int insertSelective(HostCache record);
}