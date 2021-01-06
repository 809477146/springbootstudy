package com.sz.dao;

import com.sz.model.CharacterSets;

public interface CharacterSetsMapper {
    int insert(CharacterSets record);

    int insertSelective(CharacterSets record);
}