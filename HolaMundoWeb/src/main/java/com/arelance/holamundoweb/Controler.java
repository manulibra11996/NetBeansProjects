/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundoweb;

import com.arelance.holamundoweb.beans.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "Controler", urlPatterns = {"/Controler"})
public class Controler extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {

            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            Integer edad = Integer.parseInt(request.getParameter("edad"));
            String accion = request.getParameter("accion");
            List<Usuario> listado = (List<Usuario>) request.getSession().getAttribute("listado");

            if (accion.equals("alta")) {
                request.getServletContext().getRequestDispatcher("/PostAñadirSerlet").
                        forward(request, response);
                return;
            }

            if (accion.equals("baja")) {
                request.getServletContext().getRequestDispatcher("/PreConfirmacionBorradoServlet").
                        forward(request, response);
                return;
            }

            if (accion.equals("confirmar")) {
                listado.remove(request.getSession().getAttribute("currentUser"));
                request.getRequestDispatcher("./lista.jsp").forward(request, response);
                return;
            }

            if (accion.equals("cancelar")) {
                response.sendRedirect("./datospersonales.jsp");
                return;
            }
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
