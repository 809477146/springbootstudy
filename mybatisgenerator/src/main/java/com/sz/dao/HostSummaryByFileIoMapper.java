package com.sz.dao;

import com.sz.model.HostSummaryByFileIo;

public interface HostSummaryByFileIoMapper {
    int insert(HostSummaryByFileIo record);

    int insertSelective(HostSummaryByFileIo record);
}