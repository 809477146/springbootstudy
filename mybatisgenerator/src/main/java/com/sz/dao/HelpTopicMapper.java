package com.sz.dao;

import com.sz.model.HelpTopic;
import com.sz.model.HelpTopicWithBLOBs;

public interface HelpTopicMapper {
    int deleteByPrimaryKey(Integer helpTopicId);

    int insert(HelpTopicWithBLOBs record);

    int insertSelective(HelpTopicWithBLOBs record);

    HelpTopicWithBLOBs selectByPrimaryKey(Integer helpTopicId);

    int updateByPrimaryKeySelective(HelpTopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HelpTopicWithBLOBs record);

    int updateByPrimaryKey(HelpTopic record);
}