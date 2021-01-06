package com.sz.dao;

import com.sz.model.InnodbCmpPerIndex;

public interface InnodbCmpPerIndexMapper {
    int insert(InnodbCmpPerIndex record);

    int insertSelective(InnodbCmpPerIndex record);
}