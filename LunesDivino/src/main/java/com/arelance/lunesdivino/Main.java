/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino;

/**
 *
 * @author Manuel
 */
public class Main{
    
    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder ap1= new StringBuilder("Domíngez");
        StringBuilder ap2= new StringBuilder(" Mañero");
        
        Persona p1 = new Persona("isi",ap1, 23);
//        Persona p2 = p1.clone();
//        System.out.println(p1.equals(p2));
//        p2.getApellido().append(ap2);
//        System.out.println(p1.equals(p2));
        try {
            Persona p2 = p1.clone();
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p1.equals(p2));
            p2.getApellido().append(ap2);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p1.equals(p2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
     
   
}
