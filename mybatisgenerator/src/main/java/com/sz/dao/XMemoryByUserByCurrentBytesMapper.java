package com.sz.dao;

import com.sz.model.XMemoryByUserByCurrentBytes;

public interface XMemoryByUserByCurrentBytesMapper {
    int insert(XMemoryByUserByCurrentBytes record);

    int insertSelective(XMemoryByUserByCurrentBytes record);
}