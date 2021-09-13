/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb.beans;

import java.util.Objects;



/**
 *
 * @author Manuel
 */
public class Usuario {
    private DatosPersonales dp;
    private Direccion d;

    public Usuario() {
    }

    public Usuario(DatosPersonales dp, Direccion d) {
        this.dp = dp;
        this.d = d;
    }

    public DatosPersonales getDp() {
        return dp;
    }

    public void setDp(DatosPersonales dp) {
        this.dp = dp;
    }

    public Direccion getD() {
        return d;
    }

    public void setD(Direccion d) {
        this.d = d;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.dp);
        hash = 67 * hash + Objects.hashCode(this.d);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.dp, other.dp)) {
            return false;
        }
        if (!Objects.equals(this.d, other.d)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Datos personales=" + dp.toString() + ", Direccion=" + d.toString() + '}';
    }
   
    
    
    
}
