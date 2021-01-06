package com.sz.dao;

import com.sz.model.GlobalStatus;

public interface GlobalStatusMapper {
    int insert(GlobalStatus record);

    int insertSelective(GlobalStatus record);
}