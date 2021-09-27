package com.arelance.filtrodto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.arelance.filtrodto.dtos.filters.Fiter;
import com.arelance.filtrodto.dtos.filters.NombreFilter;
import java.io.IOException;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Admin
 */
public class NameWebFilter implements javax.servlet.Filter {
    
   
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
          FilterChain chain)
          throws IOException, ServletException {


      String nombre=request.getParameter("nombre");
      if(!(nombre!=null && nombre.trim().length()>0)){
         chain.doFilter(request, response); 
      }

      List<Fiter> filters = (List<Fiter>) request.getAttribute("filter");    
      Fiter f = new NombreFilter(nombre);
      filters.add(f);

      chain.doFilter(request, response); 

    } 
}
