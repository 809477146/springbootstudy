package com.sz.dao;

import com.sz.model.IoGlobalByFileByBytesWithBLOBs;

public interface IoGlobalByFileByBytesMapper {
    int insert(IoGlobalByFileByBytesWithBLOBs record);

    int insertSelective(IoGlobalByFileByBytesWithBLOBs record);
}