/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundo.util;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class FlujosBucles {
    
     

    public static void main(String[] args) {

        double x = getData("Inserte el numero x: ");
        double y = getData("Inserte el numero y: ");
        double suma = Calculadora.sumar(x, y);
        boolean test = validacionRango(suma);
        String msg = getMsg(test);
        System.out.println(msg);

        System.out.println("El numero mayor es: " + Math.max(x, y));
        
//        System.out.println( validacionRango(x,y) ?  (int)Calculadora.sumar(x, y) + " es mayor a 100" : (int)Calculadora.sumar(x, y) + " es menor a 100"); 
        
//        if (validacionRango(x,y)) {
//            System.out.println((int) Calculadora.sumar(x, y) + " es menor a 100") ;
//        }else{
//            System.out.println((int) Calculadora.sumar(x, y) + " es mayor a 100") ;
//        }

//        if( x > y){
//            System.out.println( x + " es mayor que " + y);
//        }else if(x < y){
//            System.out.println( y + " es mayor que " + x);
//        }else{
//            System.out.println( x + " es igual a " + y);
//        }
        
       

//        //And
//        System.out.println(true && true);
//        System.out.println(false && true);
//        System.out.println(true && false);
//        System.out.println(false && false);
//        //or
//        System.out.println(true || true);
//        System.out.println(false || true);
//        System.out.println(true || false);
//        System.out.println(false || false);
    }
    
    public static double getData(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg);
        return teclado.nextInt();
    }
    
    //Metodo 1
    public static boolean validacionRango(double x, double y){
        return Calculadora.sumar(x, y) > 100;
    }
   
    //Metodo 2
    public static boolean validacionRango(double num){
        return num > 100;
    }
    
    public static String getMsg(boolean test){
        String msg;
        if(test){
            msg = "Es mayor a 100";
        }else{
            msg = "Es menor a 100";
        }
        return msg;
        
    }

}
