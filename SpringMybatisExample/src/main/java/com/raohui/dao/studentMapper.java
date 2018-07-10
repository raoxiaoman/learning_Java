package com.raohui.dao;

import com.raohui.dao.base.studentBaseMapper;
import com.raohui.model.student;

import java.util.List;

/**
*  @author author
*/
public interface studentMapper extends studentBaseMapper{
    public List<student> selectAll();
}