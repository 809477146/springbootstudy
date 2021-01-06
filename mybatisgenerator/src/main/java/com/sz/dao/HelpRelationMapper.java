package com.sz.dao;

import com.sz.model.HelpRelationKey;

public interface HelpRelationMapper {
    int deleteByPrimaryKey(HelpRelationKey key);

    int insert(HelpRelationKey record);

    int insertSelective(HelpRelationKey record);
}