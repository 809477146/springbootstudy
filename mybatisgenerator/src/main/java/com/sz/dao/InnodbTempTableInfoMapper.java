package com.sz.dao;

import com.sz.model.InnodbTempTableInfo;

public interface InnodbTempTableInfoMapper {
    int insert(InnodbTempTableInfo record);

    int insertSelective(InnodbTempTableInfo record);
}