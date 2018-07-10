package com.raohui;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CharactorFilter implements Filter{
    private String encode = null;
    @Override 
    public void init(FilterConfig filterConfig)throws ServletException{ 
        encode = filterConfig.getInitParameter("encode");
    }

    @Override
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain filterChain)throws ServletException,IOException{
        if(encode!=null){
            request.setCharacterEncoding(encode);
            HttpServletRequest httpServletRequest = (HttpServletRequest)request;
            ServletContext servletContext = httpServletRequest.getServletContext();
            servletContext.setAttribute("encode",encode);
            response.setContentType("text/html;charset="+encode);
        }
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy(){
        encode = null;
    }
}
