package com.sz.dao;

import com.sz.model.HelpCategory;

public interface HelpCategoryMapper {
    int deleteByPrimaryKey(Short helpCategoryId);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    HelpCategory selectByPrimaryKey(Short helpCategoryId);

    int updateByPrimaryKeySelective(HelpCategory record);

    int updateByPrimaryKeyWithBLOBs(HelpCategory record);

    int updateByPrimaryKey(HelpCategory record);
}