package com.sz.dao;

import com.sz.model.TableIoWaitsSummaryByIndexUsage;

public interface TableIoWaitsSummaryByIndexUsageMapper {
    int insert(TableIoWaitsSummaryByIndexUsage record);

    int insertSelective(TableIoWaitsSummaryByIndexUsage record);
}