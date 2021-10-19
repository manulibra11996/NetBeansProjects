/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agendatelefono;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class InsertandoContactos {

    public Contactos[][] contactos = new Contactos[5][];
    Scanner teclado = new Scanner(System.in);

    public void rellenarContactos() {
        anadirContactoAutomatico();
    }

    private void anadirContactoAutomatico() {
        String[] nombre = {"Pepe", "Salva", "Grabriel", "Alejandro", "Yerai"};
        String[] apellidos = {"Muñoz", "Laguna", "Padilla", "Fernández", "Garcia"};
        String[] telefono = {"666666666", "777777777", "888888888", "999999999", "111111111"};
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                contactos[i][j] = new Contactos(nombre[j], apellidos[j], telefono[j]);
            }
        }
    }

    private void anadirContacto() {
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                contactos[i][j] = new Contactos();
                System.out.println("Inserte el nombre del nuevo contacto");
                contactos[i][j].setNombre(teclado.next());
                System.out.println("Inserte los apellidos del nuevo contacto");
                contactos[i][j].setApellidos(teclado.next());
                System.out.println("Inserte el telefono del nuevo contacto");
                contactos[i][j].setTelefono(teclado.next());
            }
        }
    }

    public void buscarContacto(String nombre) {
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                if (nombre.equals(contactos[i][j].getNombre())) {
                    System.out.println("El contacto que buscas es " + contactos[i][j]);
                    break;
                } else {
                    System.out.println("No existe ningun contacto con el nombre de " + nombre);
                    break;
                }
            }
        }
    }

    public void modificarContacto(String nombre) {
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                if (nombre.equals(contactos[i][j].getNombre())) {
                    System.out.println("Elija lo que quieres modificar: (1: nombre, 2: apellidos, 3: telefono");
                    int opcion = teclado.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("El contacto cuyo nombre es " + contactos[i][j].getNombre() + " se va a cambiar por ");
                            String nombremod = teclado.next();
                            contactos[i][j].setNombre(nombremod);
                            break;
                        case 2:
                            System.out.println("El contacto cuyo apellidos son " + contactos[i][j].getApellidos() + " se van a cambiar por ");
                            String apellidosmod = teclado.next();
                            contactos[i][j].setApellidos(apellidosmod);
                            break;
                        case 3:
                            System.out.println("El contacto cuyo telefono es " + contactos[i][j].getTelefono() + " se va a cambiar por ");
                            String telefonomod = teclado.next();
                            contactos[i][j].setTelefono(telefonomod);
                            break;
                        default:
                            System.out.println("Opción no valida");
                            break;
                    }

                } else {
                    System.out.println("No existe ningun contacto con el nombre de " + nombre);
                }
            }
        }
    }

    public void mostrarContactos() {
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                System.out.println("Contacto nº" + (j + 1) + ": " + contactos[i][j]);
            }
        }
    }

    public static void main(String[] args) {

    }
}
