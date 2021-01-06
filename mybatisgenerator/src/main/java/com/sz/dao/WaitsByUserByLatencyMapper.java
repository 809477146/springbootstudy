package com.sz.dao;

import com.sz.model.WaitsByUserByLatencyWithBLOBs;

public interface WaitsByUserByLatencyMapper {
    int insert(WaitsByUserByLatencyWithBLOBs record);

    int insertSelective(WaitsByUserByLatencyWithBLOBs record);
}