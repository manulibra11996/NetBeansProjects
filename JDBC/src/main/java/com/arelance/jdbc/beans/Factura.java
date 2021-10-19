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

    private Integer idFactura;
    private Integer idUsuario;
    private Integer idArticulo;
    private Double precio;

    public Factura(Integer idFactura, Integer idUsuario, Integer idArticulo, Double precio) {
        this.idFactura = idFactura;
        this.idUsuario = idUsuario;
        this.idArticulo = idArticulo;
        this.precio = precio;
    }

    public Factura(Integer idUsuario, Integer idArticulo, double precio) {
        this.idUsuario = idUsuario;
        this.idArticulo = idArticulo;
        this.precio = precio;
    }

    public Factura(Integer idUsuario, Integer idArticulo) {
        this.idUsuario = idUsuario;
        this.idArticulo = idArticulo;
    }

    public Factura(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Factura() {
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
