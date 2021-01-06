package com.sz.dao;

import com.sz.model.Accounts;

public interface AccountsMapper {
    int insert(Accounts record);

    int insertSelective(Accounts record);
}