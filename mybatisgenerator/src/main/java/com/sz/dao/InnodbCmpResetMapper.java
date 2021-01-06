package com.sz.dao;

import com.sz.model.InnodbCmpReset;

public interface InnodbCmpResetMapper {
    int insert(InnodbCmpReset record);

    int insertSelective(InnodbCmpReset record);
}