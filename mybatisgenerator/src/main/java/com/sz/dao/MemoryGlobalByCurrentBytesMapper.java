package com.sz.dao;

import com.sz.model.MemoryGlobalByCurrentBytesWithBLOBs;

public interface MemoryGlobalByCurrentBytesMapper {
    int insert(MemoryGlobalByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryGlobalByCurrentBytesWithBLOBs record);
}