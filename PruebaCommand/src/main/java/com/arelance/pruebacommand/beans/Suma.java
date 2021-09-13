/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.pruebacommand.beans;



/**
 *
 * @author Manuel
 */
public class Suma implements ICommand{

    private final Operacion operacion;

    public Suma(Operacion operacion) {
        this.operacion = operacion;
    }

   
    @Override
    public double ejecutar() {
        return operacion.sumar();
    }
    
}
