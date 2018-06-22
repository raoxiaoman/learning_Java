package com.raohui;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName="TestFilter",urlPatterns="/*",initParams={@WebInitParam(name="count",value="5000")})
public class TestFilter implements Filter {
    private int count;
    @Override 
    public void init(FilterConfig filterConfig)throws ServletException{ 
        String param = filterConfig.getInitParameter("count");
        count = Integer.valueOf(param);
    }

    @Override
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain filterChain)throws ServletException,IOException{
        count++;
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        ServletContext servletContext = httpServletRequest.getServletContext();
        servletContext.setAttribute("count",count);
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy(){

    }


}
