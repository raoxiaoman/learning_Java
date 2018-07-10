package com.raohui.dao.base;

import java.util.List;

import com.raohui.model.course;
/**
*  @author author
*/
public interface courseBaseMapper {

    int insertcourse(course object);

    int updatecourse(course object);

    List<course> querycourse(course object);

    course querycourseLimit1(course object);

}