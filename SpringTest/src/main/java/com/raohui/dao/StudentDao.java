package com.raohui.dao;

import com.raohui.model.Student;

import java.util.List;

public interface StudentDao {
    public void create(String sno, String sname, Integer sage, String sex);
    public Student getStudent(String sno);
    public List<Student> listsStudent();
    public void delete(String sno);
    public void update(String sno,String sname,Integer sage,String sex);
}
