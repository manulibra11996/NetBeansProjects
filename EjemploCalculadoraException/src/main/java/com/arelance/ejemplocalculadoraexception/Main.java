/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocalculadoraexception;

import com.arelance.ejemplocalculadoraexception.beans.Almacen;
import com.arelance.ejemplocalculadoraexception.beans.Calculadora;
import com.arelance.ejemplocalculadoraexception.beans.Persona;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) {
        int contador = 0;
        try {
            Calculadora calculadora = new Calculadora();
            System.out.println(calculadora.dividir(0, 2));
        } catch (ArithmeticException e) {
            System.out.println("Division por cero");
        }
        try {
            Scanner teclado = new Scanner(System.in);
            Persona p = new Persona("pepe", "botella");
            Almacen almacen = new Almacen();
            try {
                almacen.add(null);
            } catch (Exception ex) {
                System.out.println("esto si se ejecuta");
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
            Persona clon = p.clone();
            var dato = teclado.next();
            var integer = Integer.parseInt(dato);
            System.out.println(integer);
        } catch (NumberFormatException e) {

            if (contador == 2) {
                System.out.println("el que avisa no es traidor");
                System.exit(0);
            } else {
                System.out.println("te avisé");
                contador++;
                main(null);
            }

        } catch (CloneNotSupportedException ex) {
            System.out.println("la clase persona no es clonable");

        } catch (Exception ex) {
            System.out.println("esto no se ejecuta");
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
