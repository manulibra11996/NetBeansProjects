/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.usuario;

import com.arelance.jdbc.beans.Usuario;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IUsuarioDao {
    
    public List<Usuario> obtener();
    public void guardar(Usuario usuario);
}
