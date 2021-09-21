/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.filter;

import com.arelance.sgaejb_jpa.DTO.MinDTO;
import com.arelance.sgaejb_jpa.dao.persona.PersonaDAO;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Manuel
 */
@WebFilter(filterName = "Filtro3", urlPatterns = {"/MainServlet"})
public class Filtro3 implements Filter {
    
    @Inject
    PersonaDAO personaDAO;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain){
            
        String nombre = request.getParameter("nombre");
        String min = request.getParameter("min");
        String max = request.getParameter("max");
        if(nombre == null && min != null && max == null){
            MinDTO minEnv = new MinDTO(Integer.parseInt(request.getParameter("min")));
            request.setAttribute("lista", personaDAO.listarFiltroPersonas(minEnv));
            return;
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
