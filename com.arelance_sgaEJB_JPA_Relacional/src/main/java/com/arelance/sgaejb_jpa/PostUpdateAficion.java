/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa;

import com.arelance.sgaejb_jpa.services.aficionservice.AficionService;
import com.arelance.sgaejb_jpa.services.personaservice.PersonaService;
import com.arelance.sgajpa.domain.Aficion;
import com.arelance.sgajpa.domain.Persona;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author salvador
 */
@WebServlet(name = "PostUpdateAficion", urlPatterns = {"/PostUpdateAficion"})
public class PostUpdateAficion extends HttpServlet {

    @Inject
    private AficionService aficionService;
    @Inject
    private PersonaService personaService;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Aficion aficion = (Aficion) request.getSession().getAttribute("aficion");
        Persona persona = (Persona) request.getSession().getAttribute("persona");
        aficion.setNombre(request.getParameter("nombre"));
        aficion.setDescripcion(request.getParameter("descripcion"));
        aficion.setPersona(persona);
        switch (request.getParameter("action")) {
            case "actualizar":
                aficionService.updateAficion(aficion);
                personaService.refrescar(persona);
                response.sendRedirect("MainServlet");
                break;
            case "eliminar":
                aficionService.removeAficion(aficion);
                personaService.refrescar(persona);
                response.sendRedirect("MainServlet");
                break;
            default:

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
