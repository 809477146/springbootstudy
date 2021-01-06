package com.sz.dao;

import com.sz.model.SetupTimers;

public interface SetupTimersMapper {
    int insert(SetupTimers record);

    int insertSelective(SetupTimers record);
}