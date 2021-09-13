/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.repasoweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Manuel
 */
public class Listener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
         String[] personas = new String[]{"Pepe","Antonio","Manuel","Juan"};
         sce.getServletContext().setAttribute("personas", personas);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
