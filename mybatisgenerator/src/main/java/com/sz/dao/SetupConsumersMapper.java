package com.sz.dao;

import com.sz.model.SetupConsumers;

public interface SetupConsumersMapper {
    int insert(SetupConsumers record);

    int insertSelective(SetupConsumers record);
}