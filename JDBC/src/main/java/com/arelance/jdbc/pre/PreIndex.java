/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.pre;

import com.arelance.jdbc.beans.Articulo;
import com.arelance.jdbc.beans.Carrito;
import com.arelance.jdbc.beans.Usuario;
import com.arelance.jdbc.dao.articulo.IArticuloDao;
import com.arelance.jdbc.dao.articulo.service.ArticuloDAOServ;
import com.arelance.jdbc.dao.carrito.ICarritoDao;
import com.arelance.jdbc.dao.carrito.service.CarritoDAOServ;
import com.arelance.jdbc.dao.usuario.IUsuarioDao;
import com.arelance.jdbc.dao.usuario.service.UsuarioDAOServ;
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
@WebServlet(name = "PreIndex", urlPatterns = {"/PreIndex"})
public class PreIndex extends HttpServlet {

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
            IArticuloDao implementacionArticulo = new ArticuloDAOServ();
            List<Articulo> listaArticulo = implementacionArticulo.obtener();
            IUsuarioDao implementacionUsuario = new UsuarioDAOServ();
            List<Usuario> listaUsuario = implementacionUsuario.obtener();
            ICarritoDao implementacionCarrito = new CarritoDAOServ();
            List<Carrito> listaCarrito = implementacionCarrito.obtener();

            request.getRequestDispatcher("./index.jsp").
                    forward(request, response);
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
