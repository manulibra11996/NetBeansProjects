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
public class Principal {
    public static void main(String[] args) {
        Accion<Contacto> tarea1 = new Accion<Contacto>(){
            @Override
            public void execute(Contacto t) {
                DataContact.INTANCE.lista.add(t);
                System.out.println("He hecho el alta");
            }
        };
        Accion[] opciones = new Accion[]{tarea1};
        GestorOpciones gestorOpciones = new GestorOpciones(opciones);
        
        gestorOpciones.executeCommand(0, new Contacto("pepe","p@gmail.com"));
        System.out.println(DataContact.INTANCE.lista.size());
    }
}
