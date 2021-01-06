package com.sz.dao;

import com.sz.model.ReplicationGroupMembers;

public interface ReplicationGroupMembersMapper {
    int insert(ReplicationGroupMembers record);

    int insertSelective(ReplicationGroupMembers record);
}