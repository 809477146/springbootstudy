package com.sz.dao;

import com.sz.model.InnodbTrx;

public interface InnodbTrxMapper {
    int insert(InnodbTrx record);

    int insertSelective(InnodbTrx record);
}