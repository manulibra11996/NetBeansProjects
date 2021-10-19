/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandpattern;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Contacto {

    private String nombre;
    private String emal;

    public Contacto() {
    }

    public Contacto(String nombre, String emal) {
        this.nombre = nombre;
        this.emal = emal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the emal
     */
    public String getEmal() {
        return emal;
    }

    /**
     * @param emal the emal to set
     */
    public void setEmal(String emal) {
        this.emal = emal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.emal);
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
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.emal, other.emal)) {
            return false;
        }
        return true;
    }

}
