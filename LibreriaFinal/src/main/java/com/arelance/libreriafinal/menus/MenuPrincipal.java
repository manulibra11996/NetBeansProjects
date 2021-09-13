/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.menus;

import com.arelance.libreriafinal.actions.Command;
import com.arelance.libreriafinal.actions.CommandSeleccionable;
import com.arelance.libreriafinal.beans.BaseDeDatos;
import com.arelance.libreriafinal.main.Main;
import com.arelance.libreriafinal.opciones.OpcionLogin;
import com.arelance.libreriafinal.opciones.OpcionRegistro;
import com.arelance.libreriafinal.opciones.OpcionSalir;
import com.arelance.libreriafinal.vistas.ViewDatos;
import com.arelance.libreriafinal.vistas.ViewOpcion;
import com.arelance.libreriafinal.vistas.ViewUsuario;
import com.arelance.libreriafinal.vistas.VistaMenuPrincipal;
import com.arelance.libreriafinal.vistas.VistaRegistroDatosPersonales;
import com.arelance.libreriafinal.vistas.VistaRegistroUsuario;

/**
 *
 * @author manulibra
 */
public class MenuPrincipal {
     public void menuPrincipal(Main main) {
        ViewUsuario viewUsuario=new VistaRegistroUsuario();
        ViewDatos viewDatos=new VistaRegistroDatosPersonales();
        ViewOpcion viewOpcion = new VistaMenuPrincipal();
        Command registro = new CommandSeleccionable(new OpcionRegistro(viewUsuario,viewDatos));
        Command login = new CommandSeleccionable(new OpcionLogin(viewUsuario));
        Command salir = new CommandSeleccionable(new OpcionSalir(viewUsuario,main));
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        
        Command[] commans = new Command[3];
        commans[1] = registro;
        commans[2] = login;
        commans[0] = salir;

        while(true){
//            System.out.println("Selecciona la opcion");
//            System.out.println("1 = Registro");
//            System.out.println("2 = Login");
//            System.out.println("0 = Salir");
//            Scanner teclado = new Scanner(System.in);
            commans[viewOpcion.Opcion()].ejecutable();
        }
    }
}
