package com.sz.dao;

import com.sz.model.UserSummaryByFileIo;

public interface UserSummaryByFileIoMapper {
    int insert(UserSummaryByFileIo record);

    int insertSelective(UserSummaryByFileIo record);
}