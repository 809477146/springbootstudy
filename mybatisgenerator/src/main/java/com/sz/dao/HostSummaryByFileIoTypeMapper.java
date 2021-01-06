package com.sz.dao;

import com.sz.model.HostSummaryByFileIoTypeWithBLOBs;

public interface HostSummaryByFileIoTypeMapper {
    int insert(HostSummaryByFileIoTypeWithBLOBs record);

    int insertSelective(HostSummaryByFileIoTypeWithBLOBs record);
}