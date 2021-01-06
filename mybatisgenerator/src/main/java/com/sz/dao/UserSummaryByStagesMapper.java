package com.sz.dao;

import com.sz.model.UserSummaryByStagesWithBLOBs;

public interface UserSummaryByStagesMapper {
    int insert(UserSummaryByStagesWithBLOBs record);

    int insertSelective(UserSummaryByStagesWithBLOBs record);
}