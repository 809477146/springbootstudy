package com.sz.dao;

import com.sz.model.StatusByHost;

public interface StatusByHostMapper {
    int insert(StatusByHost record);

    int insertSelective(StatusByHost record);
}