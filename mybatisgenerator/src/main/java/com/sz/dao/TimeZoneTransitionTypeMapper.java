package com.sz.dao;

import com.sz.model.TimeZoneTransitionType;
import com.sz.model.TimeZoneTransitionTypeKey;

public interface TimeZoneTransitionTypeMapper {
    int deleteByPrimaryKey(TimeZoneTransitionTypeKey key);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);

    int updateByPrimaryKeySelective(TimeZoneTransitionType record);

    int updateByPrimaryKey(TimeZoneTransitionType record);
}