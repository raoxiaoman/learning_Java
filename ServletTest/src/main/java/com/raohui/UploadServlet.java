package com.raohui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name ="UploadServlet",urlPatterns="/UploadServlet",asyncSupported=true)
@MultipartConfig(location="/mnt/d/share/tmp")
public class UploadServlet extends HttpServlet{
    public final static long serialVersionUID = 1l;
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String path =  this.getServletContext().getRealPath("/");
        Part p = request.getPart("file1");
        if (p.getContentType().contains("image")) {
            String name = p.getSubmittedFileName();
            int part_index = name.lastIndexOf("\\")+1;
            String dname  = name.substring(part_index,name.length());
            //System.out.println(dname);
            p.write(path+"/upload"+dname);
            out.println("文件上传成功！");

        }else{
            out.println("请选择图片文件上传！");
        }
    }


}
