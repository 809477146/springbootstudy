package com.sz.dao;

import com.sz.model.IoByThreadByLatencyWithBLOBs;

public interface IoByThreadByLatencyMapper {
    int insert(IoByThreadByLatencyWithBLOBs record);

    int insertSelective(IoByThreadByLatencyWithBLOBs record);
}