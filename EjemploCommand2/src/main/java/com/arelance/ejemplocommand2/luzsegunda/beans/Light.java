/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocommand2.luzsegunda.beans;

/**
 *
 * @author Manuel
 */
public class Light implements ISwitchable{

    public Light() {
    }
        
    @Override
     public void turnOn(){
        System.out.println("La luz esta encendida");
    }
    
    @Override
    public void turnOff(){
        System.out.println("La luz esta apagada");
    }
    
}
