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
public class PropietarioConDireccion extends Propietario {
    private StringBuilder calle;
    private int numero;
    private int piso;

    public PropietarioConDireccion() {
    }

    public PropietarioConDireccion(StringBuilder calle, int numero, int piso) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
    }

    public PropietarioConDireccion(StringBuilder nombre, StringBuilder apellido, int edad ,StringBuilder calle, int numero, int piso ) {
        super(nombre, apellido, edad);
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
    }

    

    public StringBuilder getCalle() {
        return calle;
    }

    public void setCalle(StringBuilder calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.calle);
        hash = 29 * hash + this.numero;
        hash = 29 * hash + this.piso;
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
        final PropietarioConDireccion other = (PropietarioConDireccion) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.piso != other.piso) {
            return false;
        }
        if (!Objects.equals(this.calle.toString(), other.calle.toString())) {
            return false;
        }
        return true && super.equals(other);
    }


 

    @Override
    public String toString() {
        return super.toString() + " Calle: " + calle + ", Numero: " + numero + " y Piso: " + piso;
    }

    @Override
    public PropietarioConDireccion clone() throws CloneNotSupportedException {
        PropietarioConDireccion clone = (PropietarioConDireccion) super.clone();
        clone.calle = new StringBuilder(this.calle);
        return clone;
    } 
    
    
}
