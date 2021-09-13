/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Libreria implements Cloneable{

    private  List<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public Libreria(List<Libro> libros) {
        this.libros = libros;

    }

    public boolean add(Libro libro) {
        return libros.add(libro);
    }

    @Override
    public Libreria clone() throws CloneNotSupportedException {
        Libreria clone=(Libreria) super.clone();
        clone.libros=this.getLibros();
        return clone; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>(this.libros);
        return libros;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Libro> libros = new ArrayList<>();

       
            Libreria libreria = new Libreria(libros);
            Libreria clone;
            clone = libreria.clone();
            clone.add(new Libro());
            System.out.println(clone.libros.size());
     

    }

}
