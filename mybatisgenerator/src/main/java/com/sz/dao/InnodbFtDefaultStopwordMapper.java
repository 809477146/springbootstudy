package com.sz.dao;

import com.sz.model.InnodbFtDefaultStopword;

public interface InnodbFtDefaultStopwordMapper {
    int insert(InnodbFtDefaultStopword record);

    int insertSelective(InnodbFtDefaultStopword record);
}