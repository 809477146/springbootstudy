package com.sz.dao;

import com.sz.model.InnodbCmp;

public interface InnodbCmpMapper {
    int insert(InnodbCmp record);

    int insertSelective(InnodbCmp record);
}