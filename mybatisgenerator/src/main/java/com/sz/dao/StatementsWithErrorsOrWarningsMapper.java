package com.sz.dao;

import com.sz.model.StatementsWithErrorsOrWarnings;

public interface StatementsWithErrorsOrWarningsMapper {
    int insert(StatementsWithErrorsOrWarnings record);

    int insertSelective(StatementsWithErrorsOrWarnings record);
}