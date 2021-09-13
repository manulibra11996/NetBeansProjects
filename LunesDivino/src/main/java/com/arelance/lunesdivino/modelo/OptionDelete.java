/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.modelo.views.View;

/**
 *
 * @author Manuel
 */
public class OptionDelete extends Opcion{

    public OptionDelete(View view) {
        super(view);
    }

    
    @Override
    public void ejecutarOpcion() {
        libro = super.view.getData();
        System.out.println("Estoy dandote de baja el libro " + libro.getTitulo());
    }

    
    
}
