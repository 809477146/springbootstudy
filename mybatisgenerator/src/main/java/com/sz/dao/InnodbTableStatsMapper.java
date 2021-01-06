package com.sz.dao;

import com.sz.model.InnodbTableStats;
import com.sz.model.InnodbTableStatsKey;

public interface InnodbTableStatsMapper {
    int deleteByPrimaryKey(InnodbTableStatsKey key);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    InnodbTableStats selectByPrimaryKey(InnodbTableStatsKey key);

    int updateByPrimaryKeySelective(InnodbTableStats record);

    int updateByPrimaryKey(InnodbTableStats record);
}