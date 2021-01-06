package com.sz.dao;

import com.sz.model.XWaitsByHostByLatency;

public interface XWaitsByHostByLatencyMapper {
    int insert(XWaitsByHostByLatency record);

    int insertSelective(XWaitsByHostByLatency record);
}