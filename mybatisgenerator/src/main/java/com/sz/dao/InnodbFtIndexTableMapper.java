package com.sz.dao;

import com.sz.model.InnodbFtIndexTable;

public interface InnodbFtIndexTableMapper {
    int insert(InnodbFtIndexTable record);

    int insertSelective(InnodbFtIndexTable record);
}