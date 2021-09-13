/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.actions;

import com.arelance.libreriafinal.beans.Seleccionable;

/**
 *
 * @author manulibra
 */
public class CommandSeleccionable implements Command{

    private Seleccionable seleccionable;
            
    public CommandSeleccionable(Seleccionable seleccionable) {
        this.seleccionable = seleccionable;
    }
    
    @Override
    public void ejecutable() {
        seleccionable.ejecutarOpcion();
    }
    
}
