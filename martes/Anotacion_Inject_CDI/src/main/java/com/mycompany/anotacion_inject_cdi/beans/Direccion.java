/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anotacion_inject_cdi.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author salvador
 */
@Named(value = "direccion")
@Dependent
public class Direccion {
    private String calle;
    private Long numero;
    /**
     * Creates a new instance of Direccion
     */
    public Direccion() {
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    
}
