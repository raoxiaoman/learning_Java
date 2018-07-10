package com.raohui.tool;


import org.aspectj.lang.annotation.*;

@Aspect
public class AopTestLoggingAutoProxy {
    @Pointcut("execution( * com.raohui.pointcut.*.*(..))")
    private void selectALL() {
    }

    @Before("selectALL()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice");
    }

    @After("selectALL()")
    public void afterAdvice() {
        System.out.println("afterAdvice");
    }

    @AfterReturning("selectALL()")
    public void afterRunAdvice() {
        System.out.println("afterRunAdvice");
    }

    @AfterThrowing("selectALL()")
    public void afterThrowAdvice() {
        System.out.println("afterThrowAdvice");
    }
}
