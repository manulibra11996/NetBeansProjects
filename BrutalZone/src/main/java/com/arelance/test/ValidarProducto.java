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
public class ValidarProducto implements ActionProducto {

    @Override
    public void execute(Producto producto) {
        if (producto.getPrecio() >= 100) {
            System.out.printf("El producto con el nombre de %s tiene un precio de %s", producto.getNombre(), producto.getPrecio());
        } else {
            System.out.println("Precio no valido");
        }
    }

}
