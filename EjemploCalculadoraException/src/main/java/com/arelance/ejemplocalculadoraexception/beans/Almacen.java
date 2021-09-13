/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocalculadoraexception.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Almacen {
    List<Persona> datos = new ArrayList<>();

    public boolean add(Persona e) throws Exception{
        if (e == null) {
            throw new Exception();
        }
        return datos.add(e);
    }
    
    
}
