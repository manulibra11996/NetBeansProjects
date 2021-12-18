/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pueba;

/**
 *
 * @author manuel
 */
public enum Movil {

    NOKIA("Nokia"), SAMSUNG("Samsung"), BLACKBERRY("Blackberry"), SONY("Sony"), MI3("Mi3");

    private String descripcion;

    private Movil(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
