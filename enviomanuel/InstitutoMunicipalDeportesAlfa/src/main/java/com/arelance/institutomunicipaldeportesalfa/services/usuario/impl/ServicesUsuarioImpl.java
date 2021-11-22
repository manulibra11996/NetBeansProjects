/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.services.usuario.impl;

import com.arelance.institutomunicipaldeportesalfa.domain.Usuario;
import com.arelance.institutomunicipaldeportesalfa.modelo.usuarioDAO.UsuarioDAO;
import com.arelance.institutomunicipaldeportesalfa.services.usuario.ServicesUsuario;
import javax.inject.Inject;

/**
 *
 * @author usuario
 */
public class ServicesUsuarioImpl implements ServicesUsuario {
    
    @Inject
    UsuarioDAO usuarioDAO;
    @Override
    public Usuario findUserByID(Usuario usuario) {
        return usuarioDAO.findUserByID(usuario);
    }

    @Override
    public Usuario findUserByEmail(Usuario usuario) {
       return usuarioDAO.findUserByEmail(usuario);
    }

    @Override
    public boolean alta(Usuario usuario) {
        if(usuarioDAO.findUserByEmail(usuario) == null){
            usuarioDAO.alta(usuario);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificar(Usuario usuario) {
        if(usuarioDAO.findUserByID(usuario)!= null){
            usuarioDAO.modificar(usuario);
            return true;
        }
            return false;
    }
    
}
