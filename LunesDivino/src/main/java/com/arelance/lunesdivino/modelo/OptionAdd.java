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
public class OptionAdd extends Opcion {

    public OptionAdd(View view) {
        super(view);
    }

    @Override
    public void ejecutarOpcion() {
        super.ejecutarOpcion();
        controller.altaLibro(libro);
    }
}
