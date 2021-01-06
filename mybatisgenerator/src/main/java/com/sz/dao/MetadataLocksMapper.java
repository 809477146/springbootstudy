package com.sz.dao;

import com.sz.model.MetadataLocks;

public interface MetadataLocksMapper {
    int insert(MetadataLocks record);

    int insertSelective(MetadataLocks record);
}