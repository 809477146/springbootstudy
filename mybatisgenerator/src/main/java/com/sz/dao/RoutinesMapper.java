package com.sz.dao;

import com.sz.model.RoutinesWithBLOBs;

public interface RoutinesMapper {
    int insert(RoutinesWithBLOBs record);

    int insertSelective(RoutinesWithBLOBs record);
}