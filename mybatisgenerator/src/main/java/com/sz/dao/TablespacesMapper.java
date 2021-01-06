package com.sz.dao;

import com.sz.model.Tablespaces;

public interface TablespacesMapper {
    int insert(Tablespaces record);

    int insertSelective(Tablespaces record);
}