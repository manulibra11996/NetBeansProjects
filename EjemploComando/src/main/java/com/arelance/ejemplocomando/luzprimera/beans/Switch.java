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
public class Switch {
    
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }
    
    public void flipUp(){
        flipUpCommand.execute();
    }
    
    public void flipDown(){
        flipDownCommand.execute();
    }
    
}
