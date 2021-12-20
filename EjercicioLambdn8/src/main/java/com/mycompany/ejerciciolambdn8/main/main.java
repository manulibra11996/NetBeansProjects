/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciolambdn8.main;

import com.mycompany.ejerciciolambdn8.interfaces.Operacion;

/**
 *
 * @author manuel
 */
public class main {

    private static int operaciones(int x, int y, Operacion operacion) {
        return operacion.calcular(x, y);
    }
  
    public static void main(String[] args) {
        Operacion<Integer> Sumar = (x, y) -> x + y;
        Operacion<Integer> Restar = (x, y) -> x - y;
        Operacion<Integer> Multiplicar = (x, y) -> x * y;
        Operacion<Integer> Dividir = (x, y) -> x / y;

        System.out.println(operaciones(3, 5, Sumar));
        System.out.println(operaciones(3, 5, Restar));
        System.out.println(operaciones(3, 5, Multiplicar));
        System.out.println(operaciones(3, 5, Dividir));
    }
}
