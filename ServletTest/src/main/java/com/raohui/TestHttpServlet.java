package com.raohui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="TestHttpServlet",urlPatterns="/TestHttpServlet")
public class TestHttpServlet extends HttpServlet{
    public final static long serialVersionUID = 0;
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        response.setCharacterEncoding("utf8");
        PrintWriter p = response.getWriter();
        p.println("<HTML>");
        p.println("<HEAD><TITLE>这个真的好麻烦！</TITLE></HEAD>");
        p.println("<BODY>"+this.getClass()+"</BODY>");
        p.println("</HTML>");
        p.flush();
        p.close();
    }


}
