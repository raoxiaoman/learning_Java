package com.raohui;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer num = (Integer)context.getAttribute("num");
        if(null == num){
            System.out.println("创建num!");
            context.setAttribute("num",1);
        }else{
            num++;
            System.out.println(num);
            context.setAttribute("num",num);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer num = (Integer)context.getAttribute("num");
        if(null == num){
            System.out.println("创建num!");
            context.setAttribute("num",1);
        }else{
            num--;
            System.out.println(num);
            context.setAttribute("num",num);
        }

    }

}
