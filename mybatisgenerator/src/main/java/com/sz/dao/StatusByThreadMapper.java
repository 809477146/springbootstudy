package com.sz.dao;

import com.sz.model.StatusByThread;

public interface StatusByThreadMapper {
    int insert(StatusByThread record);

    int insertSelective(StatusByThread record);
}