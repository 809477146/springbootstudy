package com.sz.dao;

import com.sz.model.WaitsByHostByLatencyWithBLOBs;

public interface WaitsByHostByLatencyMapper {
    int insert(WaitsByHostByLatencyWithBLOBs record);

    int insertSelective(WaitsByHostByLatencyWithBLOBs record);
}