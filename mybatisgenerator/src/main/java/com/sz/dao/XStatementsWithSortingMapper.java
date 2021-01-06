package com.sz.dao;

import com.sz.model.XStatementsWithSorting;

public interface XStatementsWithSortingMapper {
    int insert(XStatementsWithSorting record);

    int insertSelective(XStatementsWithSorting record);
}