/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocommand2.luzsegunda.prueba;

import com.arelance.ejemplocommand2.luzsegunda.beans.ISwitchable;

/**
 *
 * @author Manuel
 */
public class Television implements ISwitchable{

    @Override
    public void turnOn() {
        System.out.println("La tele esta encendida");
    }

    @Override
    public void turnOff() {
        System.out.println("La tele esta apagada");
    }
    
}
