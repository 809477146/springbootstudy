package com.sz.dao;

import com.sz.model.InnodbFtConfig;

public interface InnodbFtConfigMapper {
    int insert(InnodbFtConfig record);

    int insertSelective(InnodbFtConfig record);
}