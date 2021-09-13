/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.samplewebejblocal.impl;

import com.arelance.samplewebejblocal.UsuarioService;
import com.benas.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Manuel
 */
@Stateless(name = "lista2")
public class UsaurioServiceImpl2 implements UsuarioService{

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan"));
        usuarios.add(new Usuario("Gabriel"));
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Clemente"));
        usuarios.add(new Usuario("Isi"));
        
        return usuarios;
    }
    
}
