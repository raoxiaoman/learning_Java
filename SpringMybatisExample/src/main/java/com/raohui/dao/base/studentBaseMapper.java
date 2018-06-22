package com.raohui.dao.base;

import java.util.List;

import com.raohui.model.student;
/**
*  @author author
*/
public interface studentBaseMapper {

    int insertstudent(student object);

    int updatestudent(student object);

    List<student> querystudent(student object);

    student querystudentLimit1(student object);

}