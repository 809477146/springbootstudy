package com.sz.dao;

import com.sz.model.SlaveRelayLogInfo;
import com.sz.model.SlaveRelayLogInfoWithBLOBs;

public interface SlaveRelayLogInfoMapper {
    int deleteByPrimaryKey(String channelName);

    int insert(SlaveRelayLogInfoWithBLOBs record);

    int insertSelective(SlaveRelayLogInfoWithBLOBs record);

    SlaveRelayLogInfoWithBLOBs selectByPrimaryKey(String channelName);

    int updateByPrimaryKeySelective(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveRelayLogInfo record);
}