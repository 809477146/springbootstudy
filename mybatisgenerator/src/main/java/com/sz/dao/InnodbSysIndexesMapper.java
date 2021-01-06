package com.sz.dao;

import com.sz.model.InnodbSysIndexes;

public interface InnodbSysIndexesMapper {
    int insert(InnodbSysIndexes record);

    int insertSelective(InnodbSysIndexes record);
}