package com.sz.dao;

import com.sz.model.LatestFileIoWithBLOBs;

public interface LatestFileIoMapper {
    int insert(LatestFileIoWithBLOBs record);

    int insertSelective(LatestFileIoWithBLOBs record);
}