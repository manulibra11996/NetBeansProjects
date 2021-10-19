/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.salvador.beans;

/**
 *
 * @author Manuel
 */
public class Triangulo extends Figura {

    private int altura;
    private int base;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

}
