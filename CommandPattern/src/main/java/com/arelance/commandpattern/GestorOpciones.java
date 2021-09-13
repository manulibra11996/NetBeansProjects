/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandpattern;

/**
 *
 * @author Admin
 */
public class GestorOpciones {
    
    private Command<Contacto>[] opciones;

    public GestorOpciones(Command<Contacto>[] opciones) {
        this.opciones = opciones;
    }
    
    public void executeCommand(int index,Contacto contacto){
        opciones[index].execute(contacto);
    }
    
}
