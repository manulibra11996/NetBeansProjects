/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa;

import com.arelance.sgaejb_jpa.DTO.MaxDTO;
import com.arelance.sgaejb_jpa.DTO.MinDTO;
import com.arelance.sgaejb_jpa.services.aficionservice.AficionService;
import com.arelance.sgaejb_jpa.services.personaservice.PersonaService;
import com.arelance.sgajpa.domain.Persona;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
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
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"}, loadOnStartup = 0)
public class MainServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Inject
    private PersonaService personaService;
    @Inject
    private AficionService aficionService;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lista = "lista";
        String nombre = request.getParameter("nombre");
        String id = request.getParameter("id");
        if (id != null && !id.equals("")) {

            List<Persona> personas = (List<Persona>) personaService.findPersonaById(Integer.parseInt(id));
            if (personas != null) {
                request.setAttribute(lista, personas);
            }

        } else if (nombre != null && !nombre.equals("")) {
            request.setAttribute(lista, personaService.listarFiltroPersonas(nombre));
        } else {
            request.setAttribute(lista, personaService.listarPersonas());
        }
        Iterator<Object> iter = personaService.datosResumenPersona();
        while (iter.hasNext()) {
            Object[] datosResumen = (Object[]) iter.next();
            request.setAttribute("min", datosResumen[0]);
            request.setAttribute("max", datosResumen[1]);
            request.setAttribute("total", datosResumen[2]);
            request.setAttribute("aficiones", aficionService.listarResumenAficiones());
        }

        request.getRequestDispatcher("listado_personas.jsp").forward(request, response);

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
