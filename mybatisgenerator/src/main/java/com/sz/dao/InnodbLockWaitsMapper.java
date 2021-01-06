package com.sz.dao;

import com.sz.model.InnodbLockWaitsWithBLOBs;

public interface InnodbLockWaitsMapper {
    int insert(InnodbLockWaitsWithBLOBs record);

    int insertSelective(InnodbLockWaitsWithBLOBs record);
}