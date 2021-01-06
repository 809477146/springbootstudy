package com.sz.dao;

import com.sz.model.Collations;

public interface CollationsMapper {
    int insert(Collations record);

    int insertSelective(Collations record);
}