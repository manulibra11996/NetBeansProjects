/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.telefono.pruebas;

/**
 *
 * @author manulibra
 */
public class Contacto {

    private String nombre;
    private int telefono;

    public Contacto() {
        this.nombre = null;
        this.telefono = 0;
    }

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void set_nombre(String nomb) {
        this.nombre = nomb.toUpperCase();
    }

    public void set_telefono(int telf) {
        this.telefono = telf;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return telefono;
    }

}
