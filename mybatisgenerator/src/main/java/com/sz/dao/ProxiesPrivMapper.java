package com.sz.dao;

import com.sz.model.ProxiesPriv;
import com.sz.model.ProxiesPrivKey;

public interface ProxiesPrivMapper {
    int deleteByPrimaryKey(ProxiesPrivKey key);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);

    int updateByPrimaryKeySelective(ProxiesPriv record);

    int updateByPrimaryKey(ProxiesPriv record);
}