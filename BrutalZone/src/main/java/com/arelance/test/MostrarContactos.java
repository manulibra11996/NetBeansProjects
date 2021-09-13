/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.test;

/**
 *
 * @author Manuel
 */
public class MostrarContactos implements Accion{

    @Override
    public void execute(Contacto contacto) {
        System.out.printf("El contacto se llama %s y tiene el numero de telefono %s %n",contacto.getNombre(),contacto.getTelefono());
    }

    
    
}
