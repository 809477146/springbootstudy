package com.sz.dao;

import com.sz.model.ReplicationApplierStatus;

public interface ReplicationApplierStatusMapper {
    int insert(ReplicationApplierStatus record);

    int insertSelective(ReplicationApplierStatus record);
}