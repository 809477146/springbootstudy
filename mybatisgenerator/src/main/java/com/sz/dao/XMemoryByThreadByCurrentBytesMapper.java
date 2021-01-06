package com.sz.dao;

import com.sz.model.XMemoryByThreadByCurrentBytes;

public interface XMemoryByThreadByCurrentBytesMapper {
    int insert(XMemoryByThreadByCurrentBytes record);

    int insertSelective(XMemoryByThreadByCurrentBytes record);
}