/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.opciones;

import com.arelance.libreriafinal.beans.Controller;
import com.arelance.libreriafinal.vistas.ViewUsuario;

/**
 *
 * @author manulibra
 */
public class OpcionLogin extends Opciones {

    private Controller controller = new Controller();

    public OpcionLogin(ViewUsuario view) {
        super(view);
    }

    @Override
    public void ejecutarOpcion() {
        controller.loginUsuario();
    }
}
