package com.sz.dao;

import com.sz.model.ObjectsSummaryGlobalByType;

public interface ObjectsSummaryGlobalByTypeMapper {
    int insert(ObjectsSummaryGlobalByType record);

    int insertSelective(ObjectsSummaryGlobalByType record);
}