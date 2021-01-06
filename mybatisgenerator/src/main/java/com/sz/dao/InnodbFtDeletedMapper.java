package com.sz.dao;

import com.sz.model.InnodbFtDeleted;

public interface InnodbFtDeletedMapper {
    int insert(InnodbFtDeleted record);

    int insertSelective(InnodbFtDeleted record);
}