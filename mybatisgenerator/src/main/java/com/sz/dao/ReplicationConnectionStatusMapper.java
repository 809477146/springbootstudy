package com.sz.dao;

import com.sz.model.ReplicationConnectionStatus;

public interface ReplicationConnectionStatusMapper {
    int insert(ReplicationConnectionStatus record);

    int insertSelective(ReplicationConnectionStatus record);
}