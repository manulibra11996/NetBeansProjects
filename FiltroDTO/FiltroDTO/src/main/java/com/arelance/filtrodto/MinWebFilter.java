/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto;

import com.arelance.filtrodto.dtos.filters.Fiter;
import com.arelance.filtrodto.dtos.filters.MinFilter;
import java.io.IOException;
import java.util.List;
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
      if(!(minimo!=null && minimo.trim().length()>0)){
         chain.doFilter(request, response); 
      }

      List<Fiter> filters = (List<Fiter>) request.getAttribute("filter");    
      Fiter f = new MinFilter(Integer.parseInt(minimo));
      filters.add(f);

      chain.doFilter(request, response); 
     
    }

}
