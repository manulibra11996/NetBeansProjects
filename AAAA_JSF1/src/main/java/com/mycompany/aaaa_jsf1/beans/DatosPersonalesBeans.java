/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aaaa_jsf1.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author manuel
 */
@Named
@RequestScoped
public class DatosPersonalesBeans {

    private String nombre;
    /**
     * Creates a new instance of DatosPersonalesBeans
     */
    public DatosPersonalesBeans() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String goToPage(){
        return "destino";
    }
    
}
