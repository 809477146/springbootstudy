package com.sz.dao;

import com.sz.model.XProcesslistWithBLOBs;

public interface XProcesslistMapper {
    int insert(XProcesslistWithBLOBs record);

    int insertSelective(XProcesslistWithBLOBs record);
}