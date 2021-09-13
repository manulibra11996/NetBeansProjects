/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca;

import com.arelance.gestionbiblioteca.actions.Command;
import com.arelance.gestionbiblioteca.actions.CommandSeleccionable;
import com.arelance.gestionbiblioteca.beans.OpcionRegistrar;
import com.arelance.gestionbiblioteca.views.RecogerDatosUsuario;
import com.arelance.gestionbiblioteca.views.View;
import java.util.Scanner;

/**
 *
 * @author Gabri
 */
public class Principal {
    
    public static void main(String[] args) {
         View view=new RecogerDatosUsuario();
        Command registro = new CommandSeleccionable(new OpcionRegistrar(view));

        Command[] commans = new Command[1];
        commans[0] = registro;

        System.out.println("selecciona la opcion");
        Scanner teclado = new Scanner(System.in);
        commans[teclado.nextInt()].execute();
    }
}
