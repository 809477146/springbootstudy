package com.sz.dao;

import com.sz.model.XSessionWithBLOBs;

public interface XSessionMapper {
    int insert(XSessionWithBLOBs record);

    int insertSelective(XSessionWithBLOBs record);
}