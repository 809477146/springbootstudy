package com.sz.dao;

import com.sz.model.InnodbSysColumns;

public interface InnodbSysColumnsMapper {
    int insert(InnodbSysColumns record);

    int insertSelective(InnodbSysColumns record);
}