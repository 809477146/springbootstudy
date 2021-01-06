package com.sz.dao;

import com.sz.model.SchemaPrivileges;

public interface SchemaPrivilegesMapper {
    int insert(SchemaPrivileges record);

    int insertSelective(SchemaPrivileges record);
}