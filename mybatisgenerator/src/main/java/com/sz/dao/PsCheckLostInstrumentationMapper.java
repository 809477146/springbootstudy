package com.sz.dao;

import com.sz.model.PsCheckLostInstrumentation;

public interface PsCheckLostInstrumentationMapper {
    int insert(PsCheckLostInstrumentation record);

    int insertSelective(PsCheckLostInstrumentation record);
}