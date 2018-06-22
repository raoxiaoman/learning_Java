package com.raohui.controller;

import com.raohui.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String printHello(Model model){
        model.addAttribute("message","hello raohui");
        return "hello";
    }

    @RequestMapping(value = "/testGet" ,method = RequestMethod.GET)
    public String testGet(@RequestParam("test") String test){
        System.out.println(test);
        return "hello";
    }
    /*
    * json测试
    * */
    @RequestMapping(value = "/testJson",method = RequestMethod.POST)
    public @ResponseBody Student testJson(@RequestBody Student student){
        System.out.println("testJson");
        return student;
    }

    @RequestMapping(value = "/testJsonMap",method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> testJsonMap(@RequestBody Map<String,Object> map){
        return map;
    }
/*
     * 重定向页面
     * */
    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }
    /*
     * 重定向静态页面
     * */
    @RequestMapping(value = "/finalPage",method = RequestMethod.GET)
    public String finalPage(){
        return "final";
    }

    @RequestMapping(value = "/staticPage",method = RequestMethod.GET)
    public String staticPage(){
        return "redirect:/pages/final.html";
    }}
