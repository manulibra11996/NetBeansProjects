/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.vistas;

import com.arelance.libreriafinal.beans.Sesion;
import java.util.Scanner;

/**
 *
 * @author manulibra
 */
public class VistaMenuSecundario implements ViewOpcion{
    
    private Sesion sesion = Sesion.SESION;
    
    @Override
    public int Opcion() {
        System.out.println(sesion.getCurrentUser().getNick());
        System.out.println("menu secundario");
        System.out.println("1- alquilar libro");
        System.out.println("2- devolver libro");
        System.out.println("0- cerrar sesion");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        return opcion;
    }
    
}
