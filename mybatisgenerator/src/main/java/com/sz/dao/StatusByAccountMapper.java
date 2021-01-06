package com.sz.dao;

import com.sz.model.StatusByAccount;

public interface StatusByAccountMapper {
    int insert(StatusByAccount record);

    int insertSelective(StatusByAccount record);
}