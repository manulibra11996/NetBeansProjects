/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.opciones;

import com.arelance.libreriafinal.beans.Controller;
import com.arelance.libreriafinal.main.Main;
import static com.arelance.libreriafinal.main.Main.main;
import com.arelance.libreriafinal.vistas.ViewUsuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manulibra
 */
public class OpcionSalir extends Opciones {

    private Controller controller = new Controller();
    private Main main = new Main();

    public OpcionSalir(ViewUsuario view, Main main) {
        super(view);
        this.main = main;
    }

    @Override
    public void ejecutarOpcion() {
        try {
            controller.salida(main);
        } catch (IOException ex) {
            Logger.getLogger(OpcionSalir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
