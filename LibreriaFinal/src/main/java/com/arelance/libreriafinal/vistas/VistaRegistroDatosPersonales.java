/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.vistas;

import com.arelance.libreriafinal.beans.DatosPersonales;
import java.util.Scanner;

/**
 *
 * @author manulibra
 */
public class VistaRegistroDatosPersonales implements ViewDatos {

    @Override
    public DatosPersonales getData() {
        DatosPersonales personales;
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = sn.next();
        System.out.println("Introduzca su apellido");
        String apellido = sn.next();
        personales = new DatosPersonales(nombre, apellido);
        return personales;
    }

}
