package com.sz.dao;

import com.sz.model.InnodbCmpmemReset;

public interface InnodbCmpmemResetMapper {
    int insert(InnodbCmpmemReset record);

    int insertSelective(InnodbCmpmemReset record);
}