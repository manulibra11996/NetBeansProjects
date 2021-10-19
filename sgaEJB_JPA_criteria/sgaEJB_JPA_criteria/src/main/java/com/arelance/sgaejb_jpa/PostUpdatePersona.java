/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa;

import com.arelance.sgaejb_jpa.services.personaservice.AficionDao;
import com.arelance.sgaejb_jpa.services.personaservice.PersonaService;
import com.arelance.sgajpa.domain.Aficion;
import com.arelance.sgajpa.domain.Persona;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "PostUpdatePersona", urlPatterns = {"/PostUpdatePersona"})
public class PostUpdatePersona extends HttpServlet {

    @Inject
    private PersonaService personaService;
    @Inject
    private AficionDao aficionDao;

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
        Persona persona = (Persona) request.getSession().getAttribute("persona");

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "actualizar":
                    if (!persona.getNombre().equals(nombre)) {
                        persona.setNombre(request.getParameter("nombre"));
                    }
                    if (!persona.getApellido().equals(apellido)) {
                        persona.setApellido(apellido);
                    }
                    if (!persona.getEmail().equals(email)) {
                        persona.setEmail(email);
                    }
                    if (!persona.getTelefono().equals(telefono)) {
                        persona.setTelefono(telefono);
                    }
                    personaService.updatePersona(persona);

                    break;
                case "eliminar":

                    personaService.removePersona(persona);
                    break;
                case "alta":
                    persona = new Persona(nombre, apellido, email, telefono);
                    personaService.addPersona(persona);
                    request.getSession().setAttribute("persona", persona);
                    break;
                default:
                    break;

            }
        }
        String action_aficion = request.getParameter("action_aficion");
        if (action_aficion != null) {
            switch (action_aficion) {

                case "alta_aficion":

                    persona = new Persona(nombre, apellido, email, telefono);
                    Persona auxPersona = (Persona) request.getSession().getAttribute("persona");

                    Aficion aficion = new Aficion(request.getParameter("nombre_aficion"), request.getParameter("descripcion"), auxPersona);
                    aficionDao.addAficion(aficion);
                    request.getSession().setAttribute("persona", auxPersona);

                    break;
                default:
                    break;

            }
        }
        request.getRequestDispatcher("MainServlet").forward(request, response);
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
