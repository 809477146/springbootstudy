package com.sz.dao;

import com.sz.model.XHostSummary;

public interface XHostSummaryMapper {
    int insert(XHostSummary record);

    int insertSelective(XHostSummary record);
}