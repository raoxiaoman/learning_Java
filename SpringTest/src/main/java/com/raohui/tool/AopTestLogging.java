package com.raohui.tool;

public class AopTestLogging {
    public  void beforeAdvice(){
        System.out.println("beforeAdvice");
    }
    public  void afterAdvice(){
        System.out.println("afterAdvice");
    }
    public  void afterRunAdvice(){
        System.out.println("afterRunAdvice");
    }
    public void  afterThrowAdvice(){
        System.out.println("afterThrowAdvice");
    }
}
