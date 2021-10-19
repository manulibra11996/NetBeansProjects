/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.telefono.pruebas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Prueba {

    public static void main(String[] args) {

//        Scanner teclado = new Scanner(System.in); 
//        String[] datos = {"nombre","email","telefono"};
//        Contactos introducidos = new Contactos();
//        String nombre,email,telefono = null;
//        
//        
//            System.out.println("Indique el " + datos[0] +": ");
//            nombre = teclado.next();
//            System.out.println("Indique el " + datos[1] +": ");
//            email = teclado.next();
//            System.out.println("Indique el " + datos[2] +": ");
//            telefono = teclado.next();
//        
//          introducidos.setNombre(nombre);
//          introducidos.setEmail(email); 
//          introducidos.setTelefono(telefono); 
//          
        String[][] mensajes = {{"Inserte el nombre del contacto que buscas: ", "El contacto que buscas es "},
        {"Inserte el nombre del contacto que buscas para modificarlo: ", "El contacto que vas a modificar es "}};

        System.out.println(mensajes[0][0] + mensajes[1][0]);
    }
}
