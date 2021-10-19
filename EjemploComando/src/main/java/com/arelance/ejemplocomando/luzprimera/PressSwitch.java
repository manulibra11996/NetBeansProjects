/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocomando.luzprimera;

import com.arelance.ejemplocomando.luzprimera.beans.FlipDownCommand;
import com.arelance.ejemplocomando.luzprimera.beans.FlipUpCommand;
import com.arelance.ejemplocomando.luzprimera.beans.Command;
import com.arelance.ejemplocomando.luzprimera.beans.Light;
import com.arelance.ejemplocomando.luzprimera.beans.Switch;

/**
 *
 * @author Manuel
 */
public class PressSwitch {

    public static void main(String[] args) {

        String[] pruebas = {"ON", "OFF"};
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch mySwitch = new Switch(switchUp, switchDown);

        for (String prueba : pruebas) {
            switch (prueba) {
                case "ON":
                    mySwitch.flipUp();
                    break;
                case "OFF":
                    mySwitch.flipDown();
                    break;
                default:
                    System.out.println("Los argumentos solo pueden ser \"ON\" o \"OFF\".");
                    System.exit(-1);
            }
        }

    }
}
