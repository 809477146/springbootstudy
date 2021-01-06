package com.sz.dao;

import com.sz.model.UserSummaryByFileIoTypeWithBLOBs;

public interface UserSummaryByFileIoTypeMapper {
    int insert(UserSummaryByFileIoTypeWithBLOBs record);

    int insertSelective(UserSummaryByFileIoTypeWithBLOBs record);
}