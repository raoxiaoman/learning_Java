package com.raohui.mapper;

import com.raohui.model.sc;
import com.raohui.model.scKey;

public interface scMapper {
    int deleteByPrimaryKey(scKey key);

    int insert(sc record);

    int insertSelective(sc record);

    sc selectByPrimaryKey(scKey key);

    int updateByPrimaryKeySelective(sc record);

    int updateByPrimaryKey(sc record);
}