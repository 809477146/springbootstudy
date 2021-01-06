package com.sz.dao;

import com.sz.model.XWaitsByUserByLatency;

public interface XWaitsByUserByLatencyMapper {
    int insert(XWaitsByUserByLatency record);

    int insertSelective(XWaitsByUserByLatency record);
}