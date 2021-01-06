package com.sz.dao;

import com.sz.model.PerformanceTimers;

public interface PerformanceTimersMapper {
    int insert(PerformanceTimers record);

    int insertSelective(PerformanceTimers record);
}