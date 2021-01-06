package com.sz.dao;

import com.sz.model.InnodbSysForeign;

public interface InnodbSysForeignMapper {
    int insert(InnodbSysForeign record);

    int insertSelective(InnodbSysForeign record);
}