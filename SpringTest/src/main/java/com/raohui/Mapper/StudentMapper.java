package com.raohui.Mapper;


import com.raohui.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setSno(resultSet.getString("sno"));
        student.setSname(resultSet.getString("sname"));
        student.setSex(resultSet.getString("sex"));
        student.setSage(resultSet.getInt("sage"));
        return student;
    }
}
