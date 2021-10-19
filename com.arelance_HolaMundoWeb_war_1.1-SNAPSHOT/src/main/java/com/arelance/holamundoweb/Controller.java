/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundoweb;

import com.arelance.holamundoweb.beans.Usuario;
import java.io.IOException;
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
@WebServlet(name = "test", urlPatterns = {"/test", "/index.html"})
public class Controller extends HttpServlet {

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
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        String accion = request.getParameter("accion");
        if (accion.equals("alta")) {
            List<Usuario> listado = (List<Usuario>) request.getSession().getAttribute("listado");
            listado.add(new Usuario(nombre, apellido, edad));
            response.sendRedirect("./datospersonales.jsp");
            return;
        }
        if (accion.equals("baja")) {
            request.getServletContext().getRequestDispatcher("./confirmacion.jsp").
                    forward(request, response);
            return;
        }
        if (accion.equals("confirmar")) {
            List<Usuario> listado = (List<Usuario>) request.getSession().getAttribute("listado");
            listado.remove(new Usuario(nombre, apellido, edad));
            request.getServletContext().getRequestDispatcher("./datospersonales.jsp").
                    forward(request, response);
            return;
        }
        if (accion.equals("cancelar")) {
            response.sendRedirect("./datospersonales.jsp");
            return;
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
