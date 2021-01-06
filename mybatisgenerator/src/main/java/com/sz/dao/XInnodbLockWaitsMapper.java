package com.sz.dao;

import com.sz.model.XInnodbLockWaits;

public interface XInnodbLockWaitsMapper {
    int insert(XInnodbLockWaits record);

    int insertSelective(XInnodbLockWaits record);
}