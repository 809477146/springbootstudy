package com.sz.dao;

import com.sz.model.HostSummaryWithBLOBs;

public interface HostSummaryMapper {
    int insert(HostSummaryWithBLOBs record);

    int insertSelective(HostSummaryWithBLOBs record);
}