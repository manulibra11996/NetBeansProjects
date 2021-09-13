/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.pruebacommand.beans;



/**
 *
 * @author Manuel
 */
public class Operacion{

    double num1;
    double num2;

    public Operacion() {
    }

    
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar(){
        return num1+num2;
    }
    
    public double resta(){
        return num1-num2;
    }
    
    public double mulpiplicar(){
        return num1*num2;
    }
    
    public double dividir(){
        return num1/num2;
    }
    
    public void resultado(double resultado) {
        System.out.println("El resultado es " + resultado);
    }
    
}
