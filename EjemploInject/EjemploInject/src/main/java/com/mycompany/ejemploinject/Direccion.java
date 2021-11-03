/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploinject;

import javax.enterprise.inject.Model;

/**
 *
 * @author salvador
 */
@Model
public class Direccion {

    private String calle;
  
    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    
}
