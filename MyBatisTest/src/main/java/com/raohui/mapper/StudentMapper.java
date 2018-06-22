package com.raohui.mapper;

import com.raohui.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sno);

    @Select("select * from student")
    List<Student> selectAll();

    int updateByPrimaryKeySelective(Student record);

    List<Student> selectAllInSnos(List<String> snos);

    int updateByPrimaryKey(Student record);
}