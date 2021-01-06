package com.sz.dao;

import com.sz.model.InnodbSysTables;

public interface InnodbSysTablesMapper {
    int insert(InnodbSysTables record);

    int insertSelective(InnodbSysTables record);
}