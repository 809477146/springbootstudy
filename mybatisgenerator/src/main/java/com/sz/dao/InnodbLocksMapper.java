package com.sz.dao;

import com.sz.model.InnodbLocks;

public interface InnodbLocksMapper {
    int insert(InnodbLocks record);

    int insertSelective(InnodbLocks record);
}