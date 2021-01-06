package com.sz.dao;

import com.sz.model.ReplicationApplierStatusByWorker;

public interface ReplicationApplierStatusByWorkerMapper {
    int insert(ReplicationApplierStatusByWorker record);

    int insertSelective(ReplicationApplierStatusByWorker record);
}