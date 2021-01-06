package com.sz.dao;

import com.sz.model.EventsStatementsSummaryByProgram;

public interface EventsStatementsSummaryByProgramMapper {
    int insert(EventsStatementsSummaryByProgram record);

    int insertSelective(EventsStatementsSummaryByProgram record);
}