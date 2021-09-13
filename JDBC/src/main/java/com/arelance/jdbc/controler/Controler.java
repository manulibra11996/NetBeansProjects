/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.controler;

import com.arelance.jdbc.beans.Articulo;
import com.arelance.jdbc.beans.Carrito;
import com.arelance.jdbc.beans.Factura;
import com.arelance.jdbc.beans.UserIlegalExeption;
import com.arelance.jdbc.beans.Usuario;
import com.arelance.jdbc.dao.articulo.IArticuloDao;
import com.arelance.jdbc.dao.articulo.service.ArticuloDAOServ;
import com.arelance.jdbc.dao.carrito.ICarritoDao;
import com.arelance.jdbc.dao.carrito.service.CarritoDAOServ;
import com.arelance.jdbc.dao.factura.IFacturaDao;
import com.arelance.jdbc.dao.factura.service.FacturaDAOServ;
import com.arelance.jdbc.dao.usuario.IUsuarioDao;
import com.arelance.jdbc.dao.usuario.service.UsuarioDAOServ;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            String[] listaArticuloElegidos = request.getParameterValues("articulo");
            List<Integer> idListaArticulo = new ArrayList<>();
            Integer idUsuario = null;
            Integer idArticulo = null;
            
            IUsuarioDao implementacionUsuario = new UsuarioDAOServ(); 
            List<Usuario> listaUsuario = implementacionUsuario.obtener();

            IArticuloDao implementacionArticulo = new ArticuloDAOServ(); 
            List<Articulo> listaArticulo = implementacionArticulo.obtener();
            
            ICarritoDao implementacionCarrito = new CarritoDAOServ(); 
            List<Carrito> listaCarrito = implementacionCarrito.obtener();
            
            IFacturaDao implementacionFactura = new FacturaDAOServ(); 
           
            String nombre = (String) request.getSession().getAttribute("nick");
            
            if(listaArticuloElegidos != null){
                for (int i = 0; i < listaArticuloElegidos.length; i++) {
                    idListaArticulo.add(Integer.parseInt(listaArticuloElegidos[i]));
                }
            }
            
            switch(boton){
                case "Registro":
                    int registrar = 0;
                    for (Usuario usuario : listaUsuario) {
                        if (nick.compareTo(usuario.getNick()) != 0) {
                            registrar++;
                        }else{
                            registrar = 0;
                            break;
                        }
                    }  
                    if (registrar != 0) {
                    try {
                       implementacionUsuario.guardar(new Usuario(nick,password));
                    } catch (UserIlegalExeption ex) {
                        Logger.getLogger(Controler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        request.getRequestDispatcher("./login.jsp").
                            forward(request, response);
                    }else{
                        String mensaje = "El nick introducido ya existe";
                        request.setAttribute("mensaje", mensaje);
                        request.getServletContext().getRequestDispatcher("/PreRegistro").forward(request, response);
                    }
                break;

                case "Login":
                    int logearse = 0;
                    for (Usuario usuario : listaUsuario) {
                        if (nick.compareTo(usuario.getNick()) == 0 ) {
                            idUsuario=usuario.getId_usuario();
                            request.getSession().setAttribute("nick", nick);
                            request.setAttribute("idUsuario", idUsuario);
                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                        }else{
                            logearse++;
                        }
                    }
                    if (logearse == listaUsuario.size()){
                        String mensaje = "Has metido mal el nick o el password vuelve a intentarlo";
                        request.setAttribute("mensaje", mensaje);
                        request.getServletContext().getRequestDispatcher("/PreLogin").forward(request, response);
                    }
                break;
                
                case "OutLogin":
                    if(request.getSession() != null){
                        for (Usuario usuario : listaUsuario) {
                            if (nombre.compareTo(usuario.getNick()) == 0) {
                                idUsuario=usuario.getId_usuario(); 
                                for (Articulo articulo : listaArticulo) {
                                    if(idListaArticulo.contains(articulo.getId_articulo())){
                                        idArticulo = articulo.getId_articulo();
                                        implementacionCarrito.guardar(new Carrito(idUsuario, idArticulo));
                                    }
                                }
                            } 
                        }
                        request.getSession().invalidate();
                        response.sendRedirect("./index.jsp");
                    }
                break;
                
                case "Comprar":
                    if(request.getSession() != null){ 
                        for (Usuario usuario : listaUsuario) {
                            if (nombre.compareTo(usuario.getNick()) == 0) {
                                idUsuario=usuario.getId_usuario();
                            }
                        }
                        for (Articulo articulo : listaArticulo) {
                            for (Carrito carrito : listaCarrito) {
                                if(articulo.getId_articulo() == carrito.getId_articulo()){
                                    idArticulo = articulo.getId_articulo();
                                    implementacionFactura.guardar(new Factura(idUsuario,idArticulo, articulo.getPrecio()));
                                }
                            }
                        }
                    }
                    implementacionCarrito.eliminar(new Carrito(idUsuario));
                    request.getServletContext().getRequestDispatcher("/tienda/informe.jsp").forward(request, response);
                break;
                
                case "Anadircarrito":
                    if(request.getSession() != null){ 
                        for (Usuario usuario : listaUsuario) {
                            if (nombre.compareTo(usuario.getNick()) == 0) {
                                idUsuario=usuario.getId_usuario(); 
                                for (Articulo articulo : listaArticulo) {
                                    if(idListaArticulo.contains(articulo.getId_articulo())){
                                        idArticulo = articulo.getId_articulo();
                                        implementacionCarrito.guardar(new Carrito(idUsuario, idArticulo));
                                    }
                                }
                            } 
                        }
                    }
                    request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
                break;
                
                case "Vercarrito":
                    request.getServletContext().getRequestDispatcher("/tienda/carrito.jsp").forward(request, response);
                break;
                
                case "Eliminararticulos":
                    idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
                    idArticulo = Integer.parseInt(request.getParameter("idArticulo"));;
                    implementacionCarrito.eliminar_art(new Carrito(idUsuario,idArticulo));
                    request.getServletContext().getRequestDispatcher("/tienda/carrito.jsp").forward(request, response);
                break;
                
                case "VaciarCarrito":
                    idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
                    implementacionCarrito.eliminar(new Carrito(idUsuario));
                    request.getServletContext().getRequestDispatcher("/tienda/carrito.jsp").forward(request, response);
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
