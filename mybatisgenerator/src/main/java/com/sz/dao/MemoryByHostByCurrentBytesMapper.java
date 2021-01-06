package com.sz.dao;

import com.sz.model.MemoryByHostByCurrentBytesWithBLOBs;

public interface MemoryByHostByCurrentBytesMapper {
    int insert(MemoryByHostByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByHostByCurrentBytesWithBLOBs record);
}