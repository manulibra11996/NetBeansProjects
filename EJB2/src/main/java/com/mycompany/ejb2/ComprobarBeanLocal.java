/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb2;

import javax.ejb.Local;

/**
 *
 * @author manuel
 */
@Local
public interface ComprobarBeanLocal {
    String addNombre(String nombre);
    String getNombre();
    String addApellido(String apellido);
    String getApellido();
}
