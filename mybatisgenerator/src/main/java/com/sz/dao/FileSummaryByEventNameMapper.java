package com.sz.dao;

import com.sz.model.FileSummaryByEventName;

public interface FileSummaryByEventNameMapper {
    int insert(FileSummaryByEventName record);

    int insertSelective(FileSummaryByEventName record);
}