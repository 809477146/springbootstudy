package com.sz.dao;

import com.sz.model.TableConstraints;

public interface TableConstraintsMapper {
    int insert(TableConstraints record);

    int insertSelective(TableConstraints record);
}