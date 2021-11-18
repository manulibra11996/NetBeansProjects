/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb2;

import javax.ejb.Stateful;

/**
 *
 * @author manuel
 */
@Stateful
public class ComprobarBean implements ComprobarBeanLocal{

    private String nombre;
    private String apellido;
    
    @Override
    public String addNombre(String nombre) {
       this.nombre = nombre;
       return nombre;
    }

    @Override
    public String getNombre() {
      return nombre;
    }

    @Override
    public String addApellido(String apellido) {
       this.apellido = apellido;
       return apellido;
    }

    @Override
    public String getApellido() {
       return apellido;
    }
    
}
