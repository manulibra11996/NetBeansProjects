/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.modelo.actions.Command;
import com.arelance.lunesdivino.modelo.actions.CommandAlta;
import com.arelance.lunesdivino.modelo.actions.CommandBaja;
import com.arelance.lunesdivino.modelo.views.RecogerDatosLibro;
import com.arelance.lunesdivino.modelo.views.View;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) {

        View view = new RecogerDatosLibro();
        Command alta = new CommandAlta(new OptionAdd(view));
        Command baja = new CommandBaja(new OptionDelete(view));

        Command[] commands = new Command[2];
        commands[0] = alta;
        commands[1] = baja;

        System.out.println("Selecciona la opcion");
        Scanner teclado = new Scanner(System.in);
        commands[teclado.nextInt()].execute();

    }
}
