package com.sz.dao;

import com.sz.model.InnodbBufferPage;

public interface InnodbBufferPageMapper {
    int insert(InnodbBufferPage record);

    int insertSelective(InnodbBufferPage record);
}