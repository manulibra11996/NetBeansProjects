/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Test {

    public static void main(String[] args) {
//        Comparator comparator;
//        Boolean t = true;
//        Boolean f = false;
//        System.out.println(t.compareTo(f));
//        
//        List<Integer> xxx;
//        
//        Integer x = 5;
//        int resultado = x+3;
//        System.out.println(resultado);

        String[] nombres = new String[]{"Pepe", "Eva", "Marta", "Juan"};

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        ;
        };
        
        Comparator<String> comparator2 = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        ;
        };
        
        Arrays.sort(nombres, comparator.thenComparing(comparator2));
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }

}
