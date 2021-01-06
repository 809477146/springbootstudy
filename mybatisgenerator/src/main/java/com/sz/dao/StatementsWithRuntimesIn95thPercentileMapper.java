package com.sz.dao;

import com.sz.model.StatementsWithRuntimesIn95thPercentileWithBLOBs;

public interface StatementsWithRuntimesIn95thPercentileMapper {
    int insert(StatementsWithRuntimesIn95thPercentileWithBLOBs record);

    int insertSelective(StatementsWithRuntimesIn95thPercentileWithBLOBs record);
}