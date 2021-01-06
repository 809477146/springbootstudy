package com.sz.dao;

import com.sz.model.InnodbFtIndexCache;

public interface InnodbFtIndexCacheMapper {
    int insert(InnodbFtIndexCache record);

    int insertSelective(InnodbFtIndexCache record);
}