package com.sz.dao;

import com.sz.model.Plugins;

public interface PluginsMapper {
    int insert(Plugins record);

    int insertSelective(Plugins record);
}