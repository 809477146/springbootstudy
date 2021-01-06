package com.sz.dao;

import com.sz.model.SetupInstruments;

public interface SetupInstrumentsMapper {
    int insert(SetupInstruments record);

    int insertSelective(SetupInstruments record);
}