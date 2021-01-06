package com.sz.dao;

import com.sz.model.SchemaObjectOverview;

public interface SchemaObjectOverviewMapper {
    int insert(SchemaObjectOverview record);

    int insertSelective(SchemaObjectOverview record);
}