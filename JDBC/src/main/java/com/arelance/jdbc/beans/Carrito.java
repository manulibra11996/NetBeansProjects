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
public class Carrito {
    
    private Integer idcarrito;
    private Integer id_usuario;
    private Integer id_articulo;

    public Carrito(Integer idcarrito, Integer id_usuario, Integer id_articulo) {
        this.idcarrito = idcarrito;
        this.id_usuario = id_usuario;
        this.id_articulo = id_articulo;
    }

    public Carrito(Integer id_usuario, Integer id_articulo) {
        this.id_usuario = id_usuario;
        this.id_articulo = id_articulo;
    }

    public Carrito(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public Carrito() {
    }

    public Integer getIdcarrito() {
        return idcarrito;
    }

    public void setIdcarrito(Integer idcarrito) {
        this.idcarrito = idcarrito;
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
