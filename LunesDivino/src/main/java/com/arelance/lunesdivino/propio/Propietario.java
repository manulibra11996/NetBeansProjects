/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.propio;

import java.util.Objects;

/**
 *
 * @author Manuel
 */
public class Propietario implements Cloneable {

    private StringBuilder nombre;
    private StringBuilder apellido;
    private int edad;

    public Propietario() {
    }

    public Propietario(StringBuilder nombre, StringBuilder apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public StringBuilder getNombre() {
        return nombre;
    }

    public void setNombre(StringBuilder nombre) {
        this.nombre = nombre;
    }

    public StringBuilder getApellido() {
        return apellido;
    }

    public void setApellido(StringBuilder apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellido);
        hash = 59 * hash + this.edad;
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
        final Propietario other = (Propietario) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre.toString(), other.nombre.toString())) {
            return false;
        }
        if (!Objects.equals(this.apellido.toString(), other.apellido.toString())) {
            return false;
        }
        return true;
    }

    @Override
    public Propietario clone() throws CloneNotSupportedException {
        Propietario clone = (Propietario) super.clone();
        clone.nombre = new StringBuilder(this.nombre);
        clone.apellido = new StringBuilder(this.apellido);
        return clone;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellido + " y Edad: " + edad;
    }

}
