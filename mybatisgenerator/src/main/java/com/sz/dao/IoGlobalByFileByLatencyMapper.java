package com.sz.dao;

import com.sz.model.IoGlobalByFileByLatencyWithBLOBs;

public interface IoGlobalByFileByLatencyMapper {
    int insert(IoGlobalByFileByLatencyWithBLOBs record);

    int insertSelective(IoGlobalByFileByLatencyWithBLOBs record);
}