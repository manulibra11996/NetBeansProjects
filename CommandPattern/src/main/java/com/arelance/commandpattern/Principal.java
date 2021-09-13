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
public class Principal {
    public static void main(String[] args) {
        Command<Contacto> tarea1=new Command<Contacto>() {
            @Override
            public void execute(Contacto t) {
                DataContact.INTANCE.lista.add(t);
                System.out.println("He hecho el alta");
            }
        };
        Command[] opciones= new Command[]{tarea1,new CommandoBaja()};
        GestorOpciones gestorOpciones=new GestorOpciones(opciones);
         gestorOpciones.executeCommand(0, new Contacto("pepe","p@gmail.com"));
        gestorOpciones.executeCommand(1, new Contacto("pepe","p@gmail.com"));
        System.out.println(DataContact.INTANCE.lista.size());
     
        
    }
}
