/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca.beans;

import com.arelance.gestionbiblioteca.views.View;

/**
 *
 * @author Gabri
 */
public abstract class Opcion implements Seleccionable {

    protected View view;
    protected Usuario usuario;

    public Opcion(View view) {
        this.view = view;
    }
            
    @Override
    public void ejecutarOpcion() {
        usuario = view.getData();
    }
    
}
