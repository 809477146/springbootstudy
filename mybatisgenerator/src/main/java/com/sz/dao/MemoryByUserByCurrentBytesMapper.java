package com.sz.dao;

import com.sz.model.MemoryByUserByCurrentBytesWithBLOBs;

public interface MemoryByUserByCurrentBytesMapper {
    int insert(MemoryByUserByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByUserByCurrentBytesWithBLOBs record);
}