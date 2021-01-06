package com.sz.dao;

import com.sz.model.Proc;
import com.sz.model.ProcKey;
import com.sz.model.ProcWithBLOBs;

public interface ProcMapper {
    int deleteByPrimaryKey(ProcKey key);

    int insert(ProcWithBLOBs record);

    int insertSelective(ProcWithBLOBs record);

    ProcWithBLOBs selectByPrimaryKey(ProcKey key);

    int updateByPrimaryKeySelective(ProcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProcWithBLOBs record);

    int updateByPrimaryKey(Proc record);
}