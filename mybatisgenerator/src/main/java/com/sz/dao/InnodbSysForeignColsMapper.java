package com.sz.dao;

import com.sz.model.InnodbSysForeignCols;

public interface InnodbSysForeignColsMapper {
    int insert(InnodbSysForeignCols record);

    int insertSelective(InnodbSysForeignCols record);
}