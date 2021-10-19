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

    private Integer idCarrito;
    private Integer idUsuario;
    private Integer idArticulo;

    public Carrito(Integer idCarrito, Integer idUsuario, Integer idArticulo) {
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
        this.idArticulo = idArticulo;
    }

    public Carrito(Integer idUsuario, Integer idArticulo) {
        this.idUsuario = idUsuario;
        this.idArticulo = idArticulo;
    }

    public Carrito(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Carrito() {
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

}
