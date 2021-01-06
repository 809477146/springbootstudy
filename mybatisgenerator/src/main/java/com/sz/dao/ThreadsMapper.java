package com.sz.dao;

import com.sz.model.Threads;

public interface ThreadsMapper {
    int insert(Threads record);

    int insertSelective(Threads record);
}