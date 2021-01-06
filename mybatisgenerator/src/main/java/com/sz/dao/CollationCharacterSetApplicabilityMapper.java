package com.sz.dao;

import com.sz.model.CollationCharacterSetApplicability;

public interface CollationCharacterSetApplicabilityMapper {
    int insert(CollationCharacterSetApplicability record);

    int insertSelective(CollationCharacterSetApplicability record);
}