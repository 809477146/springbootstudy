package com.sz.dao;

import com.sz.model.InnodbSysTablespaces;

public interface InnodbSysTablespacesMapper {
    int insert(InnodbSysTablespaces record);

    int insertSelective(InnodbSysTablespaces record);
}