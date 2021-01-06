package com.sz.dao;

import com.sz.model.OptimizerTraceWithBLOBs;

public interface OptimizerTraceMapper {
    int insert(OptimizerTraceWithBLOBs record);

    int insertSelective(OptimizerTraceWithBLOBs record);
}