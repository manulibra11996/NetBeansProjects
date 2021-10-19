/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriabasico.beans;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Usuario {

    private DatosPersonales datosPersonales;
    private DatosLogin datosLogin;

    public Usuario(DatosPersonales datosPersonales, DatosLogin datosLogin) {
        this.datosPersonales = datosPersonales;
        this.datosLogin = datosLogin;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public DatosLogin getDatosLogin() {
        return datosLogin;
    }

    public void setDatosLogin(DatosLogin datosLogin) {
        this.datosLogin = datosLogin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.datosPersonales);
        hash = 97 * hash + Objects.hashCode(this.datosLogin);
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
        if (!Objects.equals(this.datosPersonales, other.datosPersonales)) {
            return false;
        }
        if (!Objects.equals(this.datosLogin, other.datosLogin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "datosPersonales=" + datosPersonales.toString() + ", datosLogin=" + datosLogin.toString() + '}';
    }

}
