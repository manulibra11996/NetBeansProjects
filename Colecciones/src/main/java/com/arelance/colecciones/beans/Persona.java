package com.arelance.colecciones.beans;


import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public final class Persona implements Comparable<Persona>{
    private static TreeSet<Persona> personas = new TreeSet<>();
    private final String nombre;
    private final String apellido;

    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona clone() throws CloneNotSupportedException {
        return (Persona) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Persona o) {
        int retorno = nombre.compareTo(o.nombre);
        if (retorno == 0) {
            retorno = apellido.compareTo(o.apellido); 
        }
        return retorno;
    }
    
    public static void informe(Iterator<Persona> iterator, Persona persona){
        try{
            personas.remove(persona);
            while (iterator.hasNext()) {
                Persona next = iterator.next();
                if(next.equals(persona)){
                    iterator.remove();
                    return;
                }
            }
        }catch (ConcurrentModificationException e){
            informe(personas.iterator(), persona);
        }
    }
            
    public static void main(String[] args) {
        personas.add(new Persona("Pepe", "Botella"));
        personas.add(new Persona("Ana", "Torroja"));
        personas.add(new Persona("Manolo", "Garcia"));
        personas.add(new Persona("Manolo", "Benitez"));

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        System.out.println(personas.size());
        
        informe(personas.iterator(), new Persona("Ana", "Torroja"));
        
        personas.forEach(p -> System.out.println(p.nombre + " " + p.apellido));
        
        
    }
    
    
}
