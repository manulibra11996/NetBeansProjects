/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma.operaciones;

/**
 *
 * @author Manuel
 */
public class OperacionSuma {

    private int x;
    private int y;
    private int[] datos;
    private Integer[] datos2;

    public OperacionSuma(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public OperacionSuma(int[] datos) {
        this.datos = datos;
    }

    public OperacionSuma(Integer... datos2) {
        this.datos2 = datos2;
    }

    public long sumar() {
        if (datos == null) {
            return x + y;
        }

        return calculo(this.datos);
    }

    private static long calculo(int[] datos) {
        long resultado = 0;
        for (int dato : datos) {
            resultado += dato;
        }
        return resultado;
    }

    public static long sumar(int x, int y) {
        return x + y;
    }

    public static long sumar(int[] datos) {
        return calculo(datos);
    }
}
