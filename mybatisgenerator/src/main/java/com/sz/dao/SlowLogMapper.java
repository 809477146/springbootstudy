package com.sz.dao;

import com.sz.model.SlowLogWithBLOBs;

public interface SlowLogMapper {
    int insert(SlowLogWithBLOBs record);

    int insertSelective(SlowLogWithBLOBs record);
}