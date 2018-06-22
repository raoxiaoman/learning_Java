package com.raohui.controller;

import com.raohui.model.student;
import com.raohui.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/testJson.do",method = RequestMethod.POST)
    public @ResponseBody List<student> testJson(@RequestBody student student){
        System.out.println(student);
        return studentService.getStudentLists();
    }
}
