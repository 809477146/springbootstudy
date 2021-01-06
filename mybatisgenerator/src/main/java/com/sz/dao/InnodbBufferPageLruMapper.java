package com.sz.dao;

import com.sz.model.InnodbBufferPageLru;

public interface InnodbBufferPageLruMapper {
    int insert(InnodbBufferPageLru record);

    int insertSelective(InnodbBufferPageLru record);
}