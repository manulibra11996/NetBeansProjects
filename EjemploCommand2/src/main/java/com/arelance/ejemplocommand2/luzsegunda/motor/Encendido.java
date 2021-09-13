/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocommand2.luzsegunda.motor;

import com.arelance.ejemplocommand2.luzsegunda.beans.Command;
import com.arelance.ejemplocommand2.luzsegunda.beans.ISwitchable;

/**
 *
 * @author Manuel
 */
public class Encendido implements Command{

    private final ISwitchable switchable;

    public Encendido(ISwitchable switchable) {
        this.switchable = switchable;
    }
    
    
    @Override
    public void execute() {
        switchable.turnOn();
    }
    
}
