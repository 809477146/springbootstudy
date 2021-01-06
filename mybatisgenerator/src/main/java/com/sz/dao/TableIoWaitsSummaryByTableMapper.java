package com.sz.dao;

import com.sz.model.TableIoWaitsSummaryByTable;

public interface TableIoWaitsSummaryByTableMapper {
    int insert(TableIoWaitsSummaryByTable record);

    int insertSelective(TableIoWaitsSummaryByTable record);
}