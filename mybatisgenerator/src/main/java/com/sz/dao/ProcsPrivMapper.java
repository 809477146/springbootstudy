package com.sz.dao;

import com.sz.model.ProcsPriv;
import com.sz.model.ProcsPrivKey;

public interface ProcsPrivMapper {
    int deleteByPrimaryKey(ProcsPrivKey key);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}