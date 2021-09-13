/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca.beans;

import com.arelance.gestionbiblioteca.services.CRUDRepository;
import com.arelance.gestionbiblioteca.views.RecogerDatosUsuario;
import com.arelance.gestionbiblioteca.views.View;

/**
 *
 * @author Gabri
 */
public class Controller {
    private CRUDRepository cRUDRepository=new CRUDRepository();
    private View view;
    
    public boolean registrarUsuario(){
        view=new RecogerDatosUsuario();
        Usuario usuario=view.getData();
        return  cRUDRepository.add(usuario);
}
}