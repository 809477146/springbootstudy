package com.sz.dao;

import com.sz.model.XMemoryByHostByCurrentBytes;

public interface XMemoryByHostByCurrentBytesMapper {
    int insert(XMemoryByHostByCurrentBytes record);

    int insertSelective(XMemoryByHostByCurrentBytes record);
}