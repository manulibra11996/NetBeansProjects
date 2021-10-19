/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.megajobs;

import com.arelance.megajobs.beans.Experiencia;
import com.arelance.megajobs.beans.Localizacion;
import com.arelance.megajobs.beans.Oferta;
import com.arelance.megajobs.beans.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
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
            /* TODO output your page here. You may use following sample code. */

            String nick = request.getParameter("nick");
            String password = request.getParameter("password");
            String boton = request.getParameter("boton");

            Set<Usuario> registro = (Set<Usuario>) request.getSession().getAttribute("registro");
            registro.add(new Usuario("user1", "user1"));
            Set<Oferta> ofertas = (Set<Oferta>) request.getSession().getAttribute("registro");
            ofertas.add(new Oferta("Programador Junior.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque nec elit sit amet ligula pretium iaculis ac non sem. Praesent consequat nunc at risus auctor, dictum varius sapien dignissim.",
                    Localizacion.Local, 10000, Experiencia.Junior));

            switch (boton) {
                case "registro":
                    response.sendRedirect("./PreRegistro");
                    break;
                case "login":
                    response.sendRedirect("./PreLogin");
                    break;
                case "Registro":
                    for (Usuario usuario : registro) {
                        if (nick.compareTo(usuario.getNick()) != 0) {
                            registro.add(new Usuario(nick, password));
                            request.getRequestDispatcher("./login.jsp").
                                    forward(request, response);
                        } else {
                            String mensaje = "El nick ya es utilizado";
                            request.setAttribute("mensaje", mensaje);
                            request.getServletContext().getRequestDispatcher("/PreRegistro").forward(request, response);
                        }
                    }
                    break;
                case "Login":
                    for (Usuario usuario : registro) {
                        if (nick.compareTo(usuario.getNick()) == 0) {
                            request.getSession().setAttribute("nick", nick);
                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                        } else {
                            String mensaje = "Has metido mal el nick o el password vuelve a intentarlo";
                            request.setAttribute("mensaje", mensaje);
                            request.getServletContext().getRequestDispatcher("/PreLogin").
                                    forward(request, response);
                        }
                    }
                    break;
                case "OutLogin":
                    if (request.getSession() != null) {
                        request.getSession().invalidate();
                        response.sendRedirect("./PreIndex");
                    }
                    break;
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
