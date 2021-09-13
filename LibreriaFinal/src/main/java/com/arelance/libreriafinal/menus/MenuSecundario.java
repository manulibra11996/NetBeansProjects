/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.menus;

import com.arelance.libreriafinal.actions.Command;
import com.arelance.libreriafinal.actions.CommandSeleccionable;
import com.arelance.libreriafinal.beans.BaseDeDatos;
import com.arelance.libreriafinal.opciones.OpcionAlquiler;
import com.arelance.libreriafinal.opciones.OpcionDesLogin;
import com.arelance.libreriafinal.vistas.ViewOpcion;
import com.arelance.libreriafinal.vistas.ViewUsuario;
import com.arelance.libreriafinal.vistas.VistaMenuSecundario;
import com.arelance.libreriafinal.vistas.VistaRegistroUsuario;

/**
 *
 * @author manulibra
 */
public class MenuSecundario {
     public void menuSecundario() {
        ViewUsuario viewUsuario=new VistaRegistroUsuario();
        ViewOpcion viewOpcion = new VistaMenuSecundario();
        Command alquiler = new CommandSeleccionable(new OpcionAlquiler(viewUsuario));
        Command devolver = new CommandSeleccionable(null);
        Command cerrar = new CommandSeleccionable(new OpcionDesLogin(viewUsuario));
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        
        Command[] commans = new Command[3];
        commans[1] = alquiler;
        commans[2] = devolver;
        commans[0] = cerrar;

        
        while(true){
//            System.out.println("Selecciona la opcion");
//            System.out.println("1 = Alquiler");
//            System.out.println("2 = Devolver");
//            System.out.println("0 = Cerrar sesion");
//            Scanner teclado = new Scanner(System.in);
            commans[viewOpcion.Opcion()].ejecutable();
        }
    }
}
