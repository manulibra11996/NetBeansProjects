/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejerciciosuma;

/**
 *
 * @author Manuel
 */
public class ArraysMultidimencionales {
    public static void main(String[] args) {
        
//        Integer[][] datos = new Integer[3][3];
//        
//        rellenar(datos,0,1);
//        mostrar(datos);
//       
//        
//        Integer[][] datos2 = new Integer[3][3];
//        
//       rellenar(datos2,0,2);
//        mostrar(datos2);
//
//        int x = 5;
//        modificar(x);
//        System.out.println(x);
//
        Integer[][] datos= new Integer[2][];
        rellenar(datos);
        mostrar(datos);
        
    }
    
    public static void rellenar(Integer[][] datos){
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Integer[]{contador+=2,contador+=2,contador+=2};
        }
    }
    
    public static void modificar(int x){
        x=9;
    }
    
//    public static void rellenar(Integer [][] datos, int contador,int incremento){
//        for (int i = 0; i < datos.length; i++) {
//            
//            for (int j = 0; j < datos[i].length; j++) {
//                datos[i][j]= contador+=incremento;
//            }
//            
//        }
//    }
    public static void mostrar(Integer[][] datos){
        for (int i = 0; i < datos.length; i++) {
            
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
