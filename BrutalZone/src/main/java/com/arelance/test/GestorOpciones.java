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
public class GestorOpciones {
    private Accion<Contacto>[] opciones;

    public GestorOpciones(Accion<Contacto>[] opciones) {
        this.opciones = opciones;
    }
    
   public void executeCommand(int index,Contacto contacto){
       opciones[index].execute(contacto);
   }
}
