/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma;

import com.arelance.ejerciciosuma.operaciones.OperacionSuma;
import java.util.List;
import static java.util.Arrays.*;
import static java.lang.System.out;

/**
 *
 * @author Manuel
 */
public class EjemploArray {

    public static void main(String[] args) {
//        Integer[] numeros = {5,9,3};
//        Integer[] numeros2 = new Integer[] {5,9,3};
//        Integer[] numeros3 = new Integer[3];
//        List lista = asList(numeros3);
//        out.println(lista.get(0));
////        lista.add(25);
//        lista.set(0, 9);
//        out.println(lista.get(0));
        System.out.println("Suma de array: " + OperacionSuma.sumar(new int[]{1, 5, 9}));

    }
}
