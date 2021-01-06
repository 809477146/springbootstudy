package com.sz.dao;

import com.sz.model.UserSummaryWithBLOBs;

public interface UserSummaryMapper {
    int insert(UserSummaryWithBLOBs record);

    int insertSelective(UserSummaryWithBLOBs record);
}