package com.sz.dao;

import com.sz.model.InnodbFtBeingDeleted;

public interface InnodbFtBeingDeletedMapper {
    int insert(InnodbFtBeingDeleted record);

    int insertSelective(InnodbFtBeingDeleted record);
}