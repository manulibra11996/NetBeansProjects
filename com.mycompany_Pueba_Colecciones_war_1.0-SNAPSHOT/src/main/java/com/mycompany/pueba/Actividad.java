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
public enum Actividad {
    LEER("Leer"), COCINAR("Cocinar"), CAMINAR("Caminar");

    private String descripcion;

    private Actividad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
