package com.sz.dao;

import com.sz.model.SessionStatus;

public interface SessionStatusMapper {
    int insert(SessionStatus record);

    int insertSelective(SessionStatus record);
}