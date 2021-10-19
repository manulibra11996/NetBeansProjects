/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.usuario.service;

import com.arelance.jdbc.beans.Usuario;
import com.arelance.jdbc.dao.usuario.IUsuarioDao;
import com.arelance.jdbc.dao.usuario.impl.UsuarioDAOImpl;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class UsuarioDAOServ implements IUsuarioDao {

    private IUsuarioDao usuarioDao = new UsuarioDAOImpl();

    @Override
    public List<Usuario> obtener() {
        return usuarioDao.obtener();
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarioDao.guardar(usuario);
    }

}
