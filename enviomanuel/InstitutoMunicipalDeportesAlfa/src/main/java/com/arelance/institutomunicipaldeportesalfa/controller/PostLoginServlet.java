/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.controller;

import com.arelance.institutomunicipaldeportesalfa.domain.Usuario;
import com.arelance.institutomunicipaldeportesalfa.facade.UsuarioFacadeLocal;
import com.arelance.institutomunicipaldeportesalfa.services.usuario.ServicesUsuario;
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
 * @author usuario
 */
@WebServlet(name = "PostLoginServlet", urlPatterns = {"/PostLoginServlet"})
public class PostLoginServlet extends HttpServlet {

        @Inject
        UsuarioFacadeLocal usuarioFacadeLocal;
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
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       String message = "";
       Usuario usuario = new Usuario();
       usuario.setEmailUsuario(email);
       usuario.setPassword(password);
       
       usuario = usuarioFacadeLocal.findEmail(usuario);
       
       if(usuario.getEmailUsuario().equals(email) && usuario.getPassword().equals(password)){
       request.getSession(true);
       request.getSession().setAttribute("usuariosesion", usuario);
       request.getRequestDispatcher("PreIndexServlet").forward(request, response);
       
       }else if(usuario.getEmailUsuario() == null){
            message = "El email no es correcto";
       }else{
           message = "La contrase??a no es correcta";
       }
       request.setAttribute("message", message);
       
       request.getRequestDispatcher("PreLoginServlet").forward(request, response);
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
