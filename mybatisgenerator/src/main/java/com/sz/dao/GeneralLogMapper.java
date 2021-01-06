package com.sz.dao;

import com.sz.model.GeneralLogWithBLOBs;

public interface GeneralLogMapper {
    int insert(GeneralLogWithBLOBs record);

    int insertSelective(GeneralLogWithBLOBs record);
}