/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino;

import java.util.Objects;

/**
 *
 * @author Manuel
 */
public class Persona implements Cloneable {

    private String nombre;
    private StringBuilder apellido;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, StringBuilder apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public StringBuilder getApellido() {
        return apellido;
    }

    public void setApellido(StringBuilder apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.apellido);
        hash = 53 * hash + Objects.hashCode(this.edad);
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
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

    @Override
    public Persona clone() throws CloneNotSupportedException {
        Persona clone = (Persona) super.clone();
        clone.apellido = new StringBuilder(this.apellido);
        return clone;
    }

    @Override
    public String toString() {
        return "[nombre: " + nombre + "] [apellido: " + apellido + "] [edad: " + edad + "]";
    }

}
