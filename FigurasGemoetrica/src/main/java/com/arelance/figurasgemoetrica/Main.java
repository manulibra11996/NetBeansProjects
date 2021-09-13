/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.figurasgemoetrica;

import com.arelance.figurasgemoetrica.beans.Circulo;
import com.arelance.figurasgemoetrica.beans.Figura;
import com.arelance.figurasgemoetrica.beans.Triangulo;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Figura figura=new Figura();
        if( figura instanceof Circulo){
        Circulo xxx=(Circulo) figura;
        }else{
            System.out.println("no soy un circulo");
        }
        Figura circulo =new Circulo(2);
        
        Figura triangulo=new  Triangulo(4, 2);
        mostrarArea(circulo);
        mostrarArea(triangulo);
    }
    
    public static void mostrarArea(Figura figura){
        System.out.println("El area es:"+figura.area());
    }
    
}
