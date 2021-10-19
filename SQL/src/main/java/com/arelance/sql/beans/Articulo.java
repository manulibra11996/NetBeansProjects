/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sql.beans;

/**
 *
 * @author Manuel
 */
public class Articulo {

    private final int id_articulo;
    private String nombre;
    private String precio;

    public Articulo(int id_articulo, String nombre, String precio) {
        this.id_articulo = id_articulo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
