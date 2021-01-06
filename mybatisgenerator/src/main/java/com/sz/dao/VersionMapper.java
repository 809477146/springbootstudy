package com.sz.dao;

import com.sz.model.Version;

public interface VersionMapper {
    int insert(Version record);

    int insertSelective(Version record);
}