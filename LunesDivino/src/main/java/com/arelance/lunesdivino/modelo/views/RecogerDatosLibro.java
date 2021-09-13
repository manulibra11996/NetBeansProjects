/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo.views;

import com.arelance.lunesdivino.modelo.Libro;

/**
 *
 * @author Admin
 */
public class RecogerDatosLibro implements View{

    @Override
    public Libro getData() {
        Libro libro;
        System.out.println("Dame el título");
        String titulo="XXXX";
        System.out.println("Dame el ISBN");
        String ISBN="0000000000+XXXXX";
        libro=new Libro(titulo, ISBN);
        return  libro;
       
    }
    
}
