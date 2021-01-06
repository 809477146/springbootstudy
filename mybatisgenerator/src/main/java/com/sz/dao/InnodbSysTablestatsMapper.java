package com.sz.dao;

import com.sz.model.InnodbSysTablestats;

public interface InnodbSysTablestatsMapper {
    int insert(InnodbSysTablestats record);

    int insertSelective(InnodbSysTablestats record);
}