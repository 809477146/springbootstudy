package com.sz.dao;

import com.sz.model.TriggersWithBLOBs;

public interface TriggersMapper {
    int insert(TriggersWithBLOBs record);

    int insertSelective(TriggersWithBLOBs record);
}