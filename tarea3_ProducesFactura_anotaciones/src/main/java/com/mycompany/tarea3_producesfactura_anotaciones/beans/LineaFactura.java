/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author manuel
 */
public class LineaFactura {

    @NotNull(message = "El precio no puede ser nulo")
    @DecimalMin(value = "0.00")
    @Digits(fraction = 2, integer = 5)
    private int precio;
    @NotNull(message = "La cantidad no puede ser nulo")
    @Min(value = 1)
    private int cantidad;
    @NotNull(message = "El nombre del producto no puede ser nulo")
    private String nombre_producto;

    public LineaFactura() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

}
