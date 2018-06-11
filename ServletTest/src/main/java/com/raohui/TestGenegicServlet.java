package com.raohui;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestGenegicServlet extends GenericServlet{
    public final static long  serialVersionUID = 0;

    public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
        PrintWriter p = response.getWriter();
        p.write("GenericServlet Hello!");
        p.close();
    }

}

