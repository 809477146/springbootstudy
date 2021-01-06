package com.sz.dao;

import com.sz.model.XLatestFileIo;

public interface XLatestFileIoMapper {
    int insert(XLatestFileIo record);

    int insertSelective(XLatestFileIo record);
}