/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.beans;

/**
 *
 * @author Manuel
 */
public class Factura {
    
    private Integer id_factura;
    private Integer id_usuario;
    private Integer id_articulo;
    private Double precio;

    public Factura(Integer id_factura, Integer id_usuario, Integer id_articulo, Double precio) {
        this.id_factura = id_factura;
        this.id_usuario = id_usuario;
        this.id_articulo = id_articulo;
        this.precio = precio;
    }

    public Factura(Integer id_usuario, Integer id_articulo, double precio) {
        this.id_usuario = id_usuario;
        this.id_articulo = id_articulo;
        this.precio = precio;
    }

    public Factura(Integer id_usuario, Integer id_articulo) {
        this.id_usuario = id_usuario;
        this.id_articulo = id_articulo;
    }

    public Factura(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public Factura() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }  
    
    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(Integer id_articulo) {
        this.id_articulo = id_articulo;
    }

   
}
