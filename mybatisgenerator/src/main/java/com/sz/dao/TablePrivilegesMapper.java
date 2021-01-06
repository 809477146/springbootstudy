package com.sz.dao;

import com.sz.model.TablePrivileges;

public interface TablePrivilegesMapper {
    int insert(TablePrivileges record);

    int insertSelective(TablePrivileges record);
}