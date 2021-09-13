/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplodecorator2.beans;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class DecoradorConcretoA extends Decorador{
    
    String nombre;
    Scanner teclado = new Scanner(System.in);
    
    public DecoradorConcretoA(ComponenteVisual componenteVisual) {
        super(componenteVisual);
        operacion();
    }

    @Override
    public void operacion() {
        super.operacion(); 
        nombre = teclado.next();
        System.out.println(nombre);
    }
    
    
}
