package com.sz.dao;

import com.sz.model.XUserSummary;

public interface XUserSummaryMapper {
    int insert(XUserSummary record);

    int insertSelective(XUserSummary record);
}