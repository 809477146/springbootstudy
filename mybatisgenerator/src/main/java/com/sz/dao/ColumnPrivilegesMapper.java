package com.sz.dao;

import com.sz.model.ColumnPrivileges;

public interface ColumnPrivilegesMapper {
    int insert(ColumnPrivileges record);

    int insertSelective(ColumnPrivileges record);
}