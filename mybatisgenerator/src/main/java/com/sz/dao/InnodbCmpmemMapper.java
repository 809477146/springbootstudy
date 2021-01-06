package com.sz.dao;

import com.sz.model.InnodbCmpmem;

public interface InnodbCmpmemMapper {
    int insert(InnodbCmpmem record);

    int insertSelective(InnodbCmpmem record);
}