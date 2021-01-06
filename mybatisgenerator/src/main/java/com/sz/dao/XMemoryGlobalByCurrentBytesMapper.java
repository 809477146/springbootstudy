package com.sz.dao;

import com.sz.model.XMemoryGlobalByCurrentBytes;

public interface XMemoryGlobalByCurrentBytesMapper {
    int insert(XMemoryGlobalByCurrentBytes record);

    int insertSelective(XMemoryGlobalByCurrentBytes record);
}