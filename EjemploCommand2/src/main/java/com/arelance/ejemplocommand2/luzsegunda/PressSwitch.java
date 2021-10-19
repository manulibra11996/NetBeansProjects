/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocommand2.luzsegunda;

import com.arelance.ejemplocommand2.luzsegunda.beans.FlipUpCommand;
import com.arelance.ejemplocommand2.luzsegunda.beans.Light;
import com.arelance.ejemplocommand2.luzsegunda.beans.Command;
import com.arelance.ejemplocommand2.luzsegunda.beans.FlipDownCommand;
import com.arelance.ejemplocommand2.luzsegunda.motor.Apagado;
import com.arelance.ejemplocommand2.luzsegunda.motor.Encendido;
import com.arelance.ejemplocommand2.luzsegunda.motor.Motor;
import com.arelance.ejemplocommand2.luzsegunda.prueba.ApagadoTele;
import com.arelance.ejemplocommand2.luzsegunda.prueba.EncendidoTele;
import com.arelance.ejemplocommand2.luzsegunda.prueba.Television;

/**
 *
 * @author Manuel
 */
public class PressSwitch {

    public static void main(String[] args) {

        System.out.println("Pruebas luz");
        String[] pruebas = {"ON", "OFF"};
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        for (String prueba : pruebas) {
            switch (prueba) {
                case "ON":
                    switchUp.execute();
                    break;
                case "OFF":
                    switchDown.execute();
                    break;
                default:
                    System.out.println("Los argumentos solo pueden ser \"ON\" o \"OFF\".");
                    System.exit(-1);
            }
        }

        System.out.println("");
        System.out.println("Pruebas television");
        String[] pruebasTele = {"ON", "OFF"};
        Television tele = new Television();
        Command switchArriba = new EncendidoTele(tele);
        Command switchAbajo = new ApagadoTele(tele);

        for (String prueba : pruebasTele) {
            switch (prueba) {
                case "ON":
                    switchArriba.execute();
                    break;
                case "OFF":
                    switchAbajo.execute();
                    break;
                default:
                    System.out.println("Los argumentos solo pueden ser \"ON\" o \"OFF\".");
                    System.exit(-1);
            }
        }

        System.out.println("");
        System.out.println("Pruebas motor");
        String[] pruebasMotor = {"ON", "OFF"};
        Motor motor = new Motor();
        Command encendido = new Encendido(motor);
        Command apagado = new Apagado(motor);

        for (String prueba : pruebasMotor) {
            switch (prueba) {
                case "ON":
                    encendido.execute();
                    break;
                case "OFF":
                    apagado.execute();
                    break;
                default:
                    System.out.println("Los argumentos solo pueden ser \"ON\" o \"OFF\".");
                    System.exit(-1);
            }
        }
    }
}
