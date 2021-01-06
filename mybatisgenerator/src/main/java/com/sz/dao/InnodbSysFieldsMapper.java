package com.sz.dao;

import com.sz.model.InnodbSysFields;

public interface InnodbSysFieldsMapper {
    int insert(InnodbSysFields record);

    int insertSelective(InnodbSysFields record);
}