package com.arelance.filtrodto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.arelance.filtrodto.dtos.filters.Fiter;
import com.arelance.filtrodto.dtos.filters.MinFilter;
import com.arelance.filtrodto.dtos.filters.NombreFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.DispatcherType;
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
 * @author Admin
 */
public class MinimusWebFilter implements Filter {
    
   
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
   
        String minimo=request.getParameter("minimo");
        if(minimo!=null && minimo.trim().length()>0){
            Fiter f=new MinFilter(Integer.parseInt(minimo));
            if( request.getAttribute("filter")!=null){
                 Fiter.buiderFiter(f);
            }else{
                request.setAttribute("filter", f);
                Fiter.buiderFiter(f);
            }
        }
        chain.doFilter(request, response);
      
    }

 

  
    
}
