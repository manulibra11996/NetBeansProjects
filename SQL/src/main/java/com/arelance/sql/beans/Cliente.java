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
public class Cliente {

    private final int id_cliente;
    private String nombre;
    private String articulo;

    public Cliente(int id_cliente, String nombre, String articulo) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.articulo = articulo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
}
