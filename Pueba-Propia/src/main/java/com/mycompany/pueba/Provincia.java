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
public enum Provincia {
    ALMERIA("Almeria"), CADIZ("Cadiz"), CORDOBA("Cordoba"), GRANADA("Granada"), HUELVA("Huelva"), JAEN("Jaen"), MALAGA("Malaga"), SEVILLA("Sevilla");
    
    private String descripcion;

    private Provincia(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
