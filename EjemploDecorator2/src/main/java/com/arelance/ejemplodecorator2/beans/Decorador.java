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
public abstract class Decorador implements ComponenteVisual{
      
    private final ComponenteVisual componenteVisual;
    
    public Decorador(ComponenteVisual componenteVisual){
        this.componenteVisual = componenteVisual;
    }
    
    @Override
    public void operacion(){
        this.componenteVisual.operacion();
    }
}
