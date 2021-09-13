/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplodecorator1.beans;

/**
 *
 * @author Manuel
 */
public abstract class WatchDecorator implements Watch{
    
    private final Watch watch;
    
    public WatchDecorator(Watch watch){
        this.watch = watch;
    }
    
    @Override
    public void createFunctionality(){
        this.watch.createFunctionality();
    }
}
