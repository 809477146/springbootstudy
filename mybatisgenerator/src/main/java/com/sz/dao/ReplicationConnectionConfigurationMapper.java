package com.sz.dao;

import com.sz.model.ReplicationConnectionConfiguration;

public interface ReplicationConnectionConfigurationMapper {
    int insert(ReplicationConnectionConfiguration record);

    int insertSelective(ReplicationConnectionConfiguration record);
}