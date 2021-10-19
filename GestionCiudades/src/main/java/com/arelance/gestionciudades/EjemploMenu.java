/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionciudades;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class EjemploMenu {

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int opcion;
        System.out.println("Elige una de estas opciones");
        System.out.println("1-Añadir contacto");
        System.out.println("2-Buscar contacto");
        System.out.println("3-Mostrar agenda");
        System.out.println("4-Salir programa");
        while (true) {
            System.out.println("Introduce la opcion:");
            opcion = keyBoard.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("alta");
                    break;
                case 2:
                    System.out.println("Buscar");
                    break;
                case 3:
                    System.out.println("Listar");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opción no existe");
            }
        }

    }
}
