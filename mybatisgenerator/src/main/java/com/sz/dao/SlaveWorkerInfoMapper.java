package com.sz.dao;

import com.sz.model.SlaveWorkerInfo;
import com.sz.model.SlaveWorkerInfoKey;
import com.sz.model.SlaveWorkerInfoWithBLOBs;

public interface SlaveWorkerInfoMapper {
    int deleteByPrimaryKey(SlaveWorkerInfoKey key);

    int insert(SlaveWorkerInfoWithBLOBs record);

    int insertSelective(SlaveWorkerInfoWithBLOBs record);

    SlaveWorkerInfoWithBLOBs selectByPrimaryKey(SlaveWorkerInfoKey key);

    int updateByPrimaryKeySelective(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveWorkerInfo record);
}