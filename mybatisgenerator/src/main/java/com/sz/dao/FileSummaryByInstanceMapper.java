package com.sz.dao;

import com.sz.model.FileSummaryByInstance;

public interface FileSummaryByInstanceMapper {
    int insert(FileSummaryByInstance record);

    int insertSelective(FileSummaryByInstance record);
}