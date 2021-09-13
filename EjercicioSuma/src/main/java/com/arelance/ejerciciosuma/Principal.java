/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma;

import static com.arelance.ejerciciosuma.ArraysMultidimencionales.rellenar;
import com.arelance.ejerciciosuma.operaciones.OperacionSuma;

/**
 *
 * @author Manuel
 */
public class Principal {
    public static void main(String[] args) {
        OperacionSuma operacionSuma = new OperacionSuma(3,5);
        System.out.println("Suma de atributos: " + operacionSuma.sumar());
        
        int[] x = new int[3];
        Integer[] y = new Integer[3];
        
        System.out.println(x.getClass().equals(y.getClass()));
        
        int[] datos = {5,3,9};
        System.out.println("Suma de array: " + operacionSuma.sumar(datos));
        
        Integer[][] datos2 = new Integer[3][3];
        
        int contador=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                datos2[i][j]= contador;
            }
            
        }

    }
}
