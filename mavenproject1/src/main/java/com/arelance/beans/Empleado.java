/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.beans;

/**
 *
 * @author Manuel
 */
public class Empleado extends Persona {

    public static void main(String[] args) {
        Persona persona = new Empleado();

        System.out.println(persona instanceof Persona);
        Persona xxx = new Persona();
        System.out.println(persona.getClass() == xxx.getClass());
    }
}
