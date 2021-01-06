package com.sz.dao;

import com.sz.model.ProcesslistWithBLOBs;

public interface ProcesslistMapper {
    int insert(ProcesslistWithBLOBs record);

    int insertSelective(ProcesslistWithBLOBs record);
}