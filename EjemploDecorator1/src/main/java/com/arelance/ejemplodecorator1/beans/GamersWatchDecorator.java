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
public class GamersWatchDecorator extends LuxuryWatchDecorator {

    public GamersWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.print(" and more features (Gamers Watch): ");
        this.addPowerLed();
    }

    private void addPowerLed() {
        System.out.print(" Power led");
    }

}
