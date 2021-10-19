/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.propio;

import com.arelance.lunesdivino.propio.beans.PropietarioConDireccion;
import com.arelance.lunesdivino.propio.beans.Coche;
import com.arelance.lunesdivino.propio.beans.Propietario;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Propietario p1 = new Propietario(new StringBuilder("Clemente"), new StringBuilder("Córtes"), 20);
        Coche c1 = new Coche("1234 BCD", p1);
        PropietarioConDireccion d1 = new PropietarioConDireccion(new StringBuilder("Clemente"), new StringBuilder("Córtes"), 20,
                new StringBuilder("Granada"), 4, 2);

        try {
            System.out.println("Clonacion de Propietario");
            Propietario p2 = p1.clone();
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p1.equals(p2));
            p2.getApellido().append(" Casado");
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p1.equals(p2));

            System.out.println("Clonacion de Coche");
            Coche c2 = c1.clone();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c1.equals(c2));
            c2.setPropietario(p2);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c1.equals(c2));

            System.out.println("Clonacion de Propietario Con Dirección");
            PropietarioConDireccion d2 = d1.clone();
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d1.equals(d2));
            d2.getApellido().append(" Ribera");
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d1.equals(d2));
        } catch (CloneNotSupportedException e) {
            System.out.println("El codigo anterior da error en la clonacion");
        }

    }
}
