package com.sz.dao;

import com.sz.model.Profiling;

public interface ProfilingMapper {
    int insert(Profiling record);

    int insertSelective(Profiling record);
}