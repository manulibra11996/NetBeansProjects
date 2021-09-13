/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocomando.luzprimera.beans;

/**
 *
 * @author Manuel
 */
public class FlipUpCommand implements Command{
    
    private Light theLight;
    
    public FlipUpCommand(Light light){
        this.theLight = light;
    }
    
    @Override
    public void execute(){
        theLight.turnOn();
    }
}
