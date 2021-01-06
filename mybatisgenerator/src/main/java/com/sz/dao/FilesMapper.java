package com.sz.dao;

import com.sz.model.Files;

public interface FilesMapper {
    int insert(Files record);

    int insertSelective(Files record);
}