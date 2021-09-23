/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.filtros;

import com.arelance.filtrodto.dtos.MaxFiltro;
import com.arelance.filtrodto.dtos.Filtro;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Manuel
 */
@WebFilter(filterName = "Filtro3", urlPatterns = {"/filtrar/*"})
public class Filtro3 implements Filter {
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        
        String valor3 = request.getParameter("valor3");

        if (valor3 != null && valor3.trim().length() > 0) {
            Filtro f = new MaxFiltro(valor3);
            Filtro fx = null;
            if(request.getAttribute("filtro") != null){
                fx = (Filtro) request.getAttribute("filtro");
                fx.buiderFiter(f);
            }else{
                request.setAttribute("filtro", f);
            }
        }
        
        Throwable problem = null;
        try {
            chain.doFilter(request, response);
        } catch (Throwable t) {
            // If an exception is thrown somewhere down the filter chain,
            // we still want to execute our after processing, and then
            // rethrow the problem after that.
            problem = t;
            t.printStackTrace();
        }
    }    
}
