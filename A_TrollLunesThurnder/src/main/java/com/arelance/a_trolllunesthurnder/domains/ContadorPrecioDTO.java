/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolllunesthurnder.domains;

import java.io.Serializable;

/**
 *
 * @author Manuel
 */
public class ContadorPrecioDTO implements Serializable {

    private Long contador;
    private Integer precio;

    public ContadorPrecioDTO(Long contador, Integer precio) {
        this.contador = contador;
        this.precio = precio;
    }

    public Long getContador() {
        return contador;
    }

    public void setContador(Long contador) {
        this.contador = contador;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}
