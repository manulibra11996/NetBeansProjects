/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb;

import com.arelance.tiendaweb.beans.Articulos;
import com.arelance.tiendaweb.beans.DatosPersonales;
import com.arelance.tiendaweb.beans.Direccion;
import com.arelance.tiendaweb.beans.Login;
import com.arelance.tiendaweb.beans.TipoArticulos;
import com.arelance.tiendaweb.beans.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
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
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String edad = request.getParameter("edad");

            String calle = request.getParameter("calle");
            String Numero = request.getParameter("numero");
            String cp = request.getParameter("cp");

            String nick = request.getParameter("nick");
            String password = request.getParameter("password");

            String boton = request.getParameter("boton");
            Integer contador = 4;
            if (request.getParameter("contador") != null) {
                contador = Integer.parseInt(request.getParameter("contador"));
            }

            Map<Login, Usuario> registro = (Map<Login, Usuario>) request.getSession().getAttribute("registro");
            Map<Usuario, Set<Articulos>> compras = (Map<Usuario, Set<Articulos>>) request.getSession().getAttribute("compras");

            if (registro.isEmpty()) {
                registro.put(new Login("man", "1234"), new Usuario(new DatosPersonales("Manuel", "Fernandez", "24"),
                        new Direccion("Granada", "9", "41420")));
            }

            Login login = new Login(nick, password);
            Set<Articulos> articulosc = (Set<Articulos>) request.getSession().getAttribute("articulos");
            Set<Articulos> articulosv = (Set<Articulos>) request.getSession().getAttribute("articulos");
            articulosv.add(new Articulos("Camiseta", "Camiseta blanca", TipoArticulos.textil));
            articulosv.add(new Articulos("Balon de baloncesto", "Balon de baloncesto de la NBA", TipoArticulos.deportes));
            articulosv.add(new Articulos("Mesa de salon", "Mesa de madera de 2m de largo, 0.5m de ancho y 1m de altura", TipoArticulos.hogar));

            String[] articulos = request.getParameterValues("articulos");

            switch (boton) {
                case "registro":
                    response.sendRedirect("./PreRegistro");
                    break;
                case "login":
                    response.sendRedirect("./PreLogin");
                    break;
                case "Registro":
                    registro.put(new Login(nick, password), new Usuario(new DatosPersonales(nombre, apellido, edad),
                            new Direccion(calle, Numero, cp)));
                    response.sendRedirect("./PreLogin");
                    break;
                case "Login":
                    for (Map.Entry<Login, Usuario> entry : registro.entrySet()) {
                        Login key = (Login) entry.getKey();
                        if (login.compareTo(key) == 0) {
                            request.setAttribute("articulosv", articulosv);
                            request.getSession().setAttribute("nick", nick);
                            request.getRequestDispatcher("./PreTienda").
                                    forward(request, response);
                        } else {
                            contador--;
                            if (contador != 0) {
                                String mensaje = "El nick o el password es incorrecto";
                                request.setAttribute("contador", contador);
                                request.setAttribute("mensaje", mensaje);
                                request.getServletContext().getRequestDispatcher("/login.jsp").
                                        forward(request, response);
                            } else {
                                response.sendRedirect("./PreRegistro");
                            }

                        }

                    }
                    break;
                case "carrito":
                    for (Map.Entry<Usuario, Set<Articulos>> entry : compras.entrySet()) {
                        Usuario key = entry.getKey();
                        //String[] articulos = request.getParameterValues("articulos");
                        for (String articulo : articulos) {
                            if (articulosv.contains(articulo)) {
                                articulosc.add((Articulos) articulosv);
                            }
                        }

                        compras.put(key, articulosc);
                        request.getSession().setAttribute("articulosc", articulosc);
                        request.getRequestDispatcher("./carrito.jsp").
                                forward(request, response);
                    }
                    break;
                case "cerrar":
                    response.sendRedirect("./CerrarSesion");
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
