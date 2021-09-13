/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
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
@WebFilter(filterName = "SessionMyFilter", urlPatterns = {"/tienda/ *"})
public class SessionMyFilter_1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        

//        if (request instanceof  HttpServletRequest ) {
//            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//            if (httpServletRequest.getSession(false) != null) {
//                httpServletRequest.getRequestDispatcher("./login.jsp").forward(request, response);
//            }
//        }
//        try {
//            chain.doFilter(request, response);
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }
    
}