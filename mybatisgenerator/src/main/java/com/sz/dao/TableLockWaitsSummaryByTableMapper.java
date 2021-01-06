package com.sz.dao;

import com.sz.model.TableLockWaitsSummaryByTable;

public interface TableLockWaitsSummaryByTableMapper {
    int insert(TableLockWaitsSummaryByTable record);

    int insertSelective(TableLockWaitsSummaryByTable record);
}