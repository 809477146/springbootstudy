package com.sz.dao;

import com.sz.model.TableHandles;

public interface TableHandlesMapper {
    int insert(TableHandles record);

    int insertSelective(TableHandles record);
}