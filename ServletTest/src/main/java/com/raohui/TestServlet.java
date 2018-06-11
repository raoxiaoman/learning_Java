package com.raohui;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServlet implements Servlet{
    public void init(ServletConfig arg0) throws ServletException{

    }
    public ServletConfig getServletConfig(){
        return null;
    }
    public String getServletInfo(){
        return null;

    }
    public void destroy(){
    }
    public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
        PrintWriter p = response.getWriter();
        p.write("hello world");
        p.flush();
        p.close();
    }

}

