package com.sz.dao;

import com.sz.model.IoGlobalByWaitByLatencyWithBLOBs;

public interface IoGlobalByWaitByLatencyMapper {
    int insert(IoGlobalByWaitByLatencyWithBLOBs record);

    int insertSelective(IoGlobalByWaitByLatencyWithBLOBs record);
}