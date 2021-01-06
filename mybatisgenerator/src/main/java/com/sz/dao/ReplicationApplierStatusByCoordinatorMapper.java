package com.sz.dao;

import com.sz.model.ReplicationApplierStatusByCoordinator;

public interface ReplicationApplierStatusByCoordinatorMapper {
    int insert(ReplicationApplierStatusByCoordinator record);

    int insertSelective(ReplicationApplierStatusByCoordinator record);
}