package com.raohui.tool;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custiom Event";
    }
}
