package com.sz.dao;

import com.sz.model.StatusByUser;

public interface StatusByUserMapper {
    int insert(StatusByUser record);

    int insertSelective(StatusByUser record);
}