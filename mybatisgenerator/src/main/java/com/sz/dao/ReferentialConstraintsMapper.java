package com.sz.dao;

import com.sz.model.ReferentialConstraints;

public interface ReferentialConstraintsMapper {
    int insert(ReferentialConstraints record);

    int insertSelective(ReferentialConstraints record);
}