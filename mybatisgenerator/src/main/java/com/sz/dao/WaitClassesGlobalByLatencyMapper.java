package com.sz.dao;

import com.sz.model.WaitClassesGlobalByLatencyWithBLOBs;

public interface WaitClassesGlobalByLatencyMapper {
    int insert(WaitClassesGlobalByLatencyWithBLOBs record);

    int insertSelective(WaitClassesGlobalByLatencyWithBLOBs record);
}