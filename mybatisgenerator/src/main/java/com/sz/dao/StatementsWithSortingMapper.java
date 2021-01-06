package com.sz.dao;

import com.sz.model.StatementsWithSortingWithBLOBs;

public interface StatementsWithSortingMapper {
    int insert(StatementsWithSortingWithBLOBs record);

    int insertSelective(StatementsWithSortingWithBLOBs record);
}