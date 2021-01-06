package com.sz.dao;

import com.sz.model.Views;

public interface ViewsMapper {
    int insert(Views record);

    int insertSelective(Views record);
}