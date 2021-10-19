/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundo.util;

import java.text.DecimalFormat;

/**
 *
 * @author Manuel
 */
public class Calculadora {

    //moodificadores acceso: publico, protegido, paquete y privado -> de mayor a menor
    //tipos numeros enteros:byte(1 byte),short(2 byte),int(4 byte),long(8 byte)
    //tipos numeros decimal: float(siete decimales, 32 byte), double(quince decimales, 64 byte)
    //logicos: boolean=>true/false
    //letras: char
    private Calculadora() {
    }

    public static double sumar(double x, double y) {
        return x + y;
    }

//    public int suma(){
//        return num1+num2;
//    }
    public static double restar(double x, double y) {
        return x - y;
    }

    public static double multiplicacion(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {

        DecimalFormat formateo = new DecimalFormat("#");

        System.out.println("Metodo suma: " + formateo.format(Calculadora.sumar(6, 3)));
        System.out.println("Metodo resta: " + formateo.format(Calculadora.restar(6, 3)));
        System.out.println("Metodo multiplicar: " + formateo.format(Calculadora.multiplicacion(6, 3)));
        System.out.println("Metodo dividir: " + formateo.format(Calculadora.division(6, 3)));
    }

}
