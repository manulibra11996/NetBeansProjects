/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca.services;

import com.arelance.gestionbiblioteca.beans.BaseDatosUsuario;
import com.arelance.gestionbiblioteca.beans.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Gabri
 */
public class CRUDRepository {
    private BaseDatosUsuario basedatosusuario = new BaseDatosUsuario(new ArrayList<Usuario>());

    public boolean add(Usuario usuario) {
        boolean retValue = false;
        if (usuario != null) {
            retValue = basedatosusuario.add(usuario);
        }
        return retValue;
    }
}
