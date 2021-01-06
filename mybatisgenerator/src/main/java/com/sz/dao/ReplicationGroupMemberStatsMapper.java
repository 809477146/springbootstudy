package com.sz.dao;

import com.sz.model.ReplicationGroupMemberStatsWithBLOBs;

public interface ReplicationGroupMemberStatsMapper {
    int insert(ReplicationGroupMemberStatsWithBLOBs record);

    int insertSelective(ReplicationGroupMemberStatsWithBLOBs record);
}