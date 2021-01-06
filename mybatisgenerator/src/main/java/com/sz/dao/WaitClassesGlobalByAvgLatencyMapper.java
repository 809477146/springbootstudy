package com.sz.dao;

import com.sz.model.WaitClassesGlobalByAvgLatencyWithBLOBs;

public interface WaitClassesGlobalByAvgLatencyMapper {
    int insert(WaitClassesGlobalByAvgLatencyWithBLOBs record);

    int insertSelective(WaitClassesGlobalByAvgLatencyWithBLOBs record);
}