/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.pruebacommand.main;

import com.arelance.pruebacommand.beans.Operacion;
import com.arelance.pruebacommand.beans.ICommand;
import com.arelance.pruebacommand.beans.Division;
import com.arelance.pruebacommand.beans.Multiplicacion;
import com.arelance.pruebacommand.beans.Resta;
import com.arelance.pruebacommand.beans.Suma;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class main {
    
    public static void main(String[] args) {

        Operacion operacion = new Operacion(5,3);
        
        ICommand suma = new Suma(operacion);
        ICommand resta = new Resta(operacion);
 
        ICommand multiplicacion = new Multiplicacion(operacion);
        ICommand division = new Division(operacion);
        
        ICommand[] operaciones = {suma,resta,multiplicacion,division};
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona una operación");
        int index = teclado.nextInt();
        System.out.println(operaciones[index].ejecutar());
         
    }
   
}
