package com.sz.dao;

import com.sz.model.InnodbIndexStats;
import com.sz.model.InnodbIndexStatsKey;

public interface InnodbIndexStatsMapper {
    int deleteByPrimaryKey(InnodbIndexStatsKey key);

    int insert(InnodbIndexStats record);

    int insertSelective(InnodbIndexStats record);

    InnodbIndexStats selectByPrimaryKey(InnodbIndexStatsKey key);

    int updateByPrimaryKeySelective(InnodbIndexStats record);

    int updateByPrimaryKey(InnodbIndexStats record);
}