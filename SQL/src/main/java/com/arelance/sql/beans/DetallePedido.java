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
public class DetallePedido {

    private final int id_detalle_pedido;
    private int id_pedido;
    private int id_articulo;
    private int cantidad;
    private float precio;

    public DetallePedido(int id_detalle_pedido, int id_pedido, int id_articulo, int cantidad, float precio) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.id_pedido = id_pedido;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
