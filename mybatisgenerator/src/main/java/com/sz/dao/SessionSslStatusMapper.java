package com.sz.dao;

import com.sz.model.SessionSslStatus;

public interface SessionSslStatusMapper {
    int insert(SessionSslStatus record);

    int insertSelective(SessionSslStatus record);
}