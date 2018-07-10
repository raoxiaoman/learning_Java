package com.raohui.controller;

import com.raohui.dao.StudentDao;
import com.raohui.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentDao studentDao;

    /*
    * 访问jsp页面
    * */
    @RequestMapping(value = "/student" ,method = RequestMethod.GET)
    public ModelAndView forStudent(){
        return new ModelAndView("student","command",new Student());
    }

    /*
     * post提交数据页面,数据库处理
     * */
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Student student, ModelMap modelMap){
        studentDao.create(student.getSno(),student.getSname(),student.getSage(),student.getSex());
        modelMap.addAttribute("sno",student.getSno());
        modelMap.addAttribute("sname",student.getSname());
        modelMap.addAttribute("sage",student.getSage());
        modelMap.addAttribute("sex",student.getSex());
        return  "result";
    }



}
