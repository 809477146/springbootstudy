package com.sz.dao;

import com.sz.model.IoGlobalByWaitByBytesWithBLOBs;

public interface IoGlobalByWaitByBytesMapper {
    int insert(IoGlobalByWaitByBytesWithBLOBs record);

    int insertSelective(IoGlobalByWaitByBytesWithBLOBs record);
}