/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto;

import com.arelance.filtrodto.dtos.filters.Fiter;
import com.arelance.filtrodto.dtos.filters.MinFilter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Manuel
 */
public class MinWebFilter implements Filter {

      @Override
      public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
          
       
        String minimo=request.getParameter("minimo");
        if(minimo!=null && minimo.trim().length()>0){
            Fiter f=new MinFilter(Integer.parseInt(minimo));
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
