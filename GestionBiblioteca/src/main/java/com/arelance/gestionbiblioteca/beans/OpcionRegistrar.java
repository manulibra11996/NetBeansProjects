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
public class OpcionRegistrar extends Opcion{
    
    private Controller controller = new Controller();
    
    public OpcionRegistrar(View view) {
        super(view);
    }

    @Override
    public void ejecutarOpcion() {
        super.ejecutarOpcion();
        controller.registrarUsuario();
    }

    
  
}
