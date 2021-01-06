package com.sz.dao;

import com.sz.model.TimeZoneName;

public interface TimeZoneNameMapper {
    int deleteByPrimaryKey(String name);

    int insert(TimeZoneName record);

    int insertSelective(TimeZoneName record);

    TimeZoneName selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(TimeZoneName record);

    int updateByPrimaryKey(TimeZoneName record);
}