package com.sz.dao;

import com.sz.model.SessionConnectAttrs;

public interface SessionConnectAttrsMapper {
    int insert(SessionConnectAttrs record);

    int insertSelective(SessionConnectAttrs record);
}