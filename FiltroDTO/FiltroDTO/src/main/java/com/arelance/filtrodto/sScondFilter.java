package com.arelance.filtrodto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.arelance.filtrodto.dtos.filters.Fiter;
import com.arelance.filtrodto.dtos.filters.NombreFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Admin
 */
@WebFilter

public class sScondFilter implements javax.servlet.Filter {
    
   
      @Override
      public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
       
        String nombre=request.getParameter("nombre");
        if(nombre!=null && nombre.trim().length()>0){
            Fiter f=new NombreFilter(nombre);
            Fiter fx=null;
            if( request.getAttribute("filter")!=null){
                fx=(Fiter) request.getAttribute("filter");
                 fx.buiderFiter(f);
            }else{
                request.setAttribute("filter", f);
            }
           
            
            
        }
        Throwable problem = null;
        try {
            chain.doFilter(request, response);
        } catch (Throwable t) {
            // If an exception is thrown somewhere down the filter chain,
            // we still want to execute our after processing, and then
            // rethrow the problem after that.
       
            t.printStackTrace();
        }
        
  
        // If there was a problem, we want to rethrow it if it is
     
    }

}
