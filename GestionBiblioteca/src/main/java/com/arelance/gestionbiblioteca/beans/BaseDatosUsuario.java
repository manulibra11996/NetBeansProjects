/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabri
 */
public class BaseDatosUsuario {
     private  List<Usuario> usuarios;

    public BaseDatosUsuario() {
        usuarios = new ArrayList<>();
    }

    public BaseDatosUsuario(List<Usuario> usuarios) {
        this.usuarios = usuarios;

    }

    public boolean add(Usuario usuario) {
        return usuarios.add(usuario);
    }

}
