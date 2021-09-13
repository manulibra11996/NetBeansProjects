package com.arelance.ejemplocalculadora;


import com.arelance.ejemplocalculadora.Persona;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Calculadora {
   public static int contador=0;
/**
 * realiza el calculo entre dividiendo y divisor, en caso de divisor es 0
 * salta una excepcion de tipo aritmetico
 * @param dividendo
 * @param divisor
 * @return
 * @throws ArithmeticException 
 */
    public double dividir(double dividendo, double divisor) throws ArithmeticException
    {
        if(divisor==0)
        {
            throw new ArithmeticException();
        }
        return dividendo/divisor;
    }
//    
//    public static void main(String[] args) {
//        try
//        {
//        Calculadora calculadora = new Calculadora();
//            System.out.println(calculadora.dividir(3,0));
//        }catch(ArithmeticException e){System.out.println("division por cero");};
//
//    }
    
    public static void main(String[] args) {
         try{
            Scanner teclado =new Scanner(System.in);
            Persona p=new Persona("pepe", "botella");
            Almacen almacen=new Almacen();
             try {
                 almacen.add(null);
             } catch (Exception ex) {
                 System.out.println("esto si se ejecuta");
                 Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
             }
            Persona clon=p.clone();
            var dato=teclado.next();
            var integer= Integer.parseInt(dato);
            System.out.println(integer);
        } catch(NumberFormatException e){
             
                    if(contador==2)
                    {
                        System.out.println("el que avisa no es traidor");
                        System.exit(0);
                    }else
                    {
                        System.out.println("te avisé");
                        contador++;
                        main(null);
                    }
            
        } 
         catch (CloneNotSupportedException ex) {
            System.out.println("la clase persona no es clonable");
        
        }catch (Exception ex) {
             System.out.println("esto no se ejecuta");
                 Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
}
