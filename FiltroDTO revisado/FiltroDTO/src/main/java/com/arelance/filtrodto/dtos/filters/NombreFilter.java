/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.dtos.filters;

import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class NombreFilter extends Fiter {

    private String nombre;

    public NombreFilter(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String execute() {

        return "nombre=" + nombre;
        // 
    }

}
