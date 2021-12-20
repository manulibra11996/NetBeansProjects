/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciolambdn8.main;

import com.mycompany.ejerciciolambdn8.interfaces.Operacion;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author manuel
 */
public class main {

    private static int operaciones(int x, int y, Operacion operacion) {
        return (int) operacion.calcular(x, y);
    }
  
    public static void main(String[] args) {
        Operacion<Integer> Sumar = (x, y) -> x + y;
        Operacion<Integer> Restar = (x, y) -> x - y;
        Operacion<Integer> Multiplicar = (x, y) -> x * y;
        Operacion<Integer> Dividir = (x, y) -> x / y;
        List<Operacion<Integer>> lista = new LinkedList<>();
        lista.add(Sumar);
        lista.add(Restar);

        lista.forEach(op->System.out.println(op.calcular(5, 3)));
        
    }
}
