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
public class Calculadora implements ISwitchable{

    public Calculadora() {
    }

    
    @Override
    public void resultado(double resultado) {
        System.out.println("El resultado es " + resultado);
    }
    
}
