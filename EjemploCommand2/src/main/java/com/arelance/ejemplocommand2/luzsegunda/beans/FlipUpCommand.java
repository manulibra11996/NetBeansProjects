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
public class FlipUpCommand implements Command{
    
    private final ISwitchable switchableReceiver;

    public FlipUpCommand(ISwitchable switchableReceiver) {
        this.switchableReceiver = switchableReceiver;
    }
    
    
    @Override
    public void execute() {
        switchableReceiver.turnOn();
    }
    
}
