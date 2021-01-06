package com.sz.dao;

import com.sz.model.InnodbSysVirtual;

public interface InnodbSysVirtualMapper {
    int insert(InnodbSysVirtual record);

    int insertSelective(InnodbSysVirtual record);
}