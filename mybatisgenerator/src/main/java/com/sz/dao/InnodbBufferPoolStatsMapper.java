package com.sz.dao;

import com.sz.model.InnodbBufferPoolStats;

public interface InnodbBufferPoolStatsMapper {
    int insert(InnodbBufferPoolStats record);

    int insertSelective(InnodbBufferPoolStats record);
}