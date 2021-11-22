/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.modelo.usuarioDAO;

import com.arelance.institutomunicipaldeportesalfa.domain.Usuario;
import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface UsuarioDAO {
    
    Usuario findUserByID(Usuario usuario);
    Usuario findUserByEmail(Usuario usuario);
    boolean alta(Usuario usuario);
    boolean modificar(Usuario usuario);
}
