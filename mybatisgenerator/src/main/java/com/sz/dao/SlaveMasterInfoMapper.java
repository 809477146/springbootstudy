package com.sz.dao;

import com.sz.model.SlaveMasterInfo;
import com.sz.model.SlaveMasterInfoWithBLOBs;

public interface SlaveMasterInfoMapper {
    int deleteByPrimaryKey(String channelName);

    int insert(SlaveMasterInfoWithBLOBs record);

    int insertSelective(SlaveMasterInfoWithBLOBs record);

    SlaveMasterInfoWithBLOBs selectByPrimaryKey(String channelName);

    int updateByPrimaryKeySelective(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveMasterInfo record);
}