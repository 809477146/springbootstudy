package com.sz.dao;

import com.sz.model.HostSummaryByStagesWithBLOBs;

public interface HostSummaryByStagesMapper {
    int insert(HostSummaryByStagesWithBLOBs record);

    int insertSelective(HostSummaryByStagesWithBLOBs record);
}