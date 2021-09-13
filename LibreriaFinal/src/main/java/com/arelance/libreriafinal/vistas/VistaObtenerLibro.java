/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.vistas;

import com.arelance.libreriafinal.beans.Libro;
import java.util.Scanner;

/**
 *
 * @author manulibra
 */
public class VistaObtenerLibro implements ViewLibro{

    @Override
    public Libro getData() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el titulo ");
        String titulo = teclado.next();
        System.out.println("Introduzca el isbn ");
        String isbn = teclado.next();
        Libro alquilo = new Libro(titulo, isbn);
        return alquilo;
    }
    
}
