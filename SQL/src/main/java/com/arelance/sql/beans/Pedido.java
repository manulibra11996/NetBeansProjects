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
public class Pedido {
    private final int id_pedido;
    private int id_cliente;

    public Pedido(int id_pedido, int id_cliente) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
