package com.sz.dao;

import com.sz.model.NdbBinlogIndex;
import com.sz.model.NdbBinlogIndexKey;

public interface NdbBinlogIndexMapper {
    int deleteByPrimaryKey(NdbBinlogIndexKey key);

    int insert(NdbBinlogIndex record);

    int insertSelective(NdbBinlogIndex record);

    NdbBinlogIndex selectByPrimaryKey(NdbBinlogIndexKey key);

    int updateByPrimaryKeySelective(NdbBinlogIndex record);

    int updateByPrimaryKey(NdbBinlogIndex record);
}