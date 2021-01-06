package com.sz.dao;

import com.sz.model.SocketInstances;

public interface SocketInstancesMapper {
    int insert(SocketInstances record);

    int insertSelective(SocketInstances record);
}