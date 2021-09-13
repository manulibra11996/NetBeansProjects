/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplodecorator2.beans;

/**
 *
 * @author Manuel
 */
public class DecoradorConcretoB extends Decorador{
    
    public DecoradorConcretoB(ComponenteVisual componenteVisual) {
        super(componenteVisual);
        this.comportamientoAñadido();
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println("Usando operacion");
    }

    private void comportamientoAñadido() {
        System.out.println("Comportamiento añadido");
    }
    
    
    
}
