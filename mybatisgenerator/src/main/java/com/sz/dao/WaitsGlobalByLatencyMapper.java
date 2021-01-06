package com.sz.dao;

import com.sz.model.WaitsGlobalByLatencyWithBLOBs;

public interface WaitsGlobalByLatencyMapper {
    int insert(WaitsGlobalByLatencyWithBLOBs record);

    int insertSelective(WaitsGlobalByLatencyWithBLOBs record);
}