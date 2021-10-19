/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.listener;

import com.arelance.jdbc.dao.usuario.impl.UsuarioDAOImpl;
import com.arelance.jdbc.beans.Usuario;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Manuel
 */
public class UsuarioServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Set<Usuario> usuarios = new HashSet<>();
        UsuarioDAOImpl implementacionUsuario = new UsuarioDAOImpl();
        List<Usuario> listaUsuario = implementacionUsuario.obtener();
        for (Usuario usuario : listaUsuario) {
            usuarios.add(new Usuario(usuario.getNick(), usuario.getContraseña()));
        }

        sce.getServletContext().setAttribute("usuarios", usuarios);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
