package com.sz.dao;

import com.sz.model.TimeZoneTransition;
import com.sz.model.TimeZoneTransitionKey;

public interface TimeZoneTransitionMapper {
    int deleteByPrimaryKey(TimeZoneTransitionKey key);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    TimeZoneTransition selectByPrimaryKey(TimeZoneTransitionKey key);

    int updateByPrimaryKeySelective(TimeZoneTransition record);

    int updateByPrimaryKey(TimeZoneTransition record);
}