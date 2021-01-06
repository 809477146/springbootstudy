package com.sz.dao;

import com.sz.model.XStatementsWithErrorsOrWarnings;

public interface XStatementsWithErrorsOrWarningsMapper {
    int insert(XStatementsWithErrorsOrWarnings record);

    int insertSelective(XStatementsWithErrorsOrWarnings record);
}