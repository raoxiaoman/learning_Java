package com.raohui.model;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
    @PostConstruct
    public void init(){
        System.out.println("init!!!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy!!!");
    }
    private String message;

    public String getMessage() {
        return message;
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
