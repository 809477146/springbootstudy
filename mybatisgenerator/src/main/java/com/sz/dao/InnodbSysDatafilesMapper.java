package com.sz.dao;

import com.sz.model.InnodbSysDatafiles;

public interface InnodbSysDatafilesMapper {
    int insert(InnodbSysDatafiles record);

    int insertSelective(InnodbSysDatafiles record);
}