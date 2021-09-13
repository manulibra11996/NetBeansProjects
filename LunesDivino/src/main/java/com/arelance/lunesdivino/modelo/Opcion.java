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
public class Opcion implements Seleccionable{

    protected View view;
    protected Libro libro;
    protected Controller controller = Controller.MAINCONTROLLER;
    
    public Opcion(View view) {
        this.view = view;
    }
    
    
    @Override
    public void ejecutarOpcion() {
        libro = view.getData();
        if (libro != null) {
            System.out.println("Se a dado de alta al libro " + libro.getTitulo());
        }
    }
    
}
