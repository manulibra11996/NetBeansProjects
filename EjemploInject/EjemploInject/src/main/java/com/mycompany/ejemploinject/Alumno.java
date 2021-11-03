/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploinject;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author salvador
 */
@Model
public class Alumno {

    private String nombre;
    @Inject
    private Direccion direccion;

    //  private final Direccion direccion;
//    @Inject
//    public Alumno(Direccion direccion) {
//        this.direccion = direccion;
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Inject
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
