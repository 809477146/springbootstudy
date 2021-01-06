package com.sz.dao;

import com.sz.model.ReplicationApplierConfiguration;

public interface ReplicationApplierConfigurationMapper {
    int insert(ReplicationApplierConfiguration record);

    int insertSelective(ReplicationApplierConfiguration record);
}