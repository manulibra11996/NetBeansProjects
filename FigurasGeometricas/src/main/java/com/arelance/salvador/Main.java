/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.salvador;

import com.arelance.salvador.beans.Circulo;
import com.arelance.salvador.beans.Figura;
import com.arelance.salvador.beans.Triangulo;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) {
        Figura figura = new Figura();
        if (figura instanceof Circulo) {
            Circulo xxx = (Circulo) figura;
        } else {
            System.out.println("No soy un circulo");
        }
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(4, 2);

        mostrarArea(circulo);
        mostrarArea(triangulo);
    }

    public static void mostrarArea(Figura figura) {
        System.out.println("El area es:" + figura.area());
    }
}
