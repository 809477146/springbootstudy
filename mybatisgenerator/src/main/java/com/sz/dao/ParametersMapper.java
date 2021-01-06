package com.sz.dao;

import com.sz.model.Parameters;

public interface ParametersMapper {
    int insert(Parameters record);

    int insertSelective(Parameters record);
}