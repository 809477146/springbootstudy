package com.sz.dao;

import com.sz.model.SessionWithBLOBs;

public interface SessionMapper {
    int insert(SessionWithBLOBs record);

    int insertSelective(SessionWithBLOBs record);
}