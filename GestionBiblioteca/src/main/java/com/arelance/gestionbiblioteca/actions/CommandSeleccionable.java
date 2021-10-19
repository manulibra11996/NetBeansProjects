/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca.actions;

import com.arelance.gestionbiblioteca.beans.Seleccionable;

/**
 *
 * @author Gabri
 */
public class CommandSeleccionable implements Command {

    private Seleccionable seleccionable;

    public CommandSeleccionable(Seleccionable seleccionable) {
        this.seleccionable = seleccionable;
    }

    public void execute() {
        seleccionable.ejecutarOpcion();
    }

}
