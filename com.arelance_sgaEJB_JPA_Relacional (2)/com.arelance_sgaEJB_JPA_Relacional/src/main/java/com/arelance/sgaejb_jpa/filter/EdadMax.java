/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.filter;

import com.arelance.sgaejb_jpa.DTO.MaxDTO;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Manuel
 */
@WebFilter(filterName = "EdadMax", urlPatterns = {"/*"})
public class EdadMax implements Filter {
    
   @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        if (request instanceof  HttpServletRequest ) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            MaxDTO max = new MaxDTO();
            if(httpServletRequest.getParameter("max") != null){
                max.setMax(Integer.parseInt(httpServletRequest.getParameter("max")));
            }
            httpServletRequest.setAttribute("max", max);
        }
        try {
            chain.doFilter(request, response);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }
}
