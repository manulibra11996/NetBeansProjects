/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.vistas;

import java.util.Scanner;

/**
 *
 * @author manulibra
 */
public class VistaMenuPrincipal implements ViewOpcion {

    @Override
    public int Opcion() {
        System.out.println("menu principal");
        System.out.println("1- resgistrar");
        System.out.println("2- logear");
        System.out.println("0- salir");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        return opcion;
    }

}
