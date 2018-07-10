package com.raohui.service.impl;

import com.raohui.dao.studentMapper;
import com.raohui.model.student;
import com.raohui.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private studentMapper studentMapper;
    @Override
    public List<student> getStudentLists() {
        return studentMapper.selectAll();
    }
}
