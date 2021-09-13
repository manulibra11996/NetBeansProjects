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
public class Apagado implements Command{

    public final ISwitchable switchable;

    public Apagado(ISwitchable switchable) {
        this.switchable = switchable;
    }
    
    
    
    @Override
    public void execute() {
        switchable.turnOff();
    }
    
}
