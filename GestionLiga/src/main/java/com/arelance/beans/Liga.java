/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

/**
 *
 * @author Manuel
 */
public class Liga {

    private static Liga liga;
    private static final int MAXIMO = 8;
    private final Jugador[] jugadores = new Jugador[MAXIMO];

    private Liga() {
        rellenarJugadores();
    }

    public static Liga getInstance() {
        if (liga == null) {
            liga = new Liga();
        }
        return liga;
    }

    private void rellenarJugadores() {
        String[] nombres = {"Pepe", "Juan", "Antonio", "Manolo", "Matias", "Pedro", "Vicente", "Raul"};
        for (int i = 0; i < MAXIMO; i++) {
            jugadores[i] = new Jugador(nombres[i], (int) Math.round(Math.random() * 99 + 1));
        }
    }

    public static void main(String[] args) {
        Jugador[] jugadores = Liga.getInstance().jugadores;
    }

}
