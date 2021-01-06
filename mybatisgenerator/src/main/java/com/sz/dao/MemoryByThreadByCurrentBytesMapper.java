package com.sz.dao;

import com.sz.model.MemoryByThreadByCurrentBytesWithBLOBs;

public interface MemoryByThreadByCurrentBytesMapper {
    int insert(MemoryByThreadByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByThreadByCurrentBytesWithBLOBs record);
}