package com.sz.dao;

import com.sz.model.EventsStatementsSummaryByDigest;

public interface EventsStatementsSummaryByDigestMapper {
    int insert(EventsStatementsSummaryByDigest record);

    int insertSelective(EventsStatementsSummaryByDigest record);
}