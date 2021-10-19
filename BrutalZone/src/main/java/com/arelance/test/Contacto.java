/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.test;

/**
 *
 * @author Manuel
 */
public class Contacto {

    private String Nombre;
    private String email;

    public Contacto() {
    }

    public Contacto(String Nombre, String email) {
        this.Nombre = Nombre;
        this.email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
