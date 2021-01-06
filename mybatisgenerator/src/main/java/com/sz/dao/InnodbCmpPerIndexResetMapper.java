package com.sz.dao;

import com.sz.model.InnodbCmpPerIndexReset;

public interface InnodbCmpPerIndexResetMapper {
    int insert(InnodbCmpPerIndexReset record);

    int insertSelective(InnodbCmpPerIndexReset record);
}