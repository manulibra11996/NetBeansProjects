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
public class ValidarContacto implements Accion {

    @Override
    public void execute(Contacto contacto) {
        if (contacto.getNombre() != null && contacto.getTelefono() != null) {
            System.out.printf("El contacto %s ha sido registrado.%n", contacto.getNombre());
        } else {
            System.out.println("Fallo al guardar el contacto");
        }
    }

}
