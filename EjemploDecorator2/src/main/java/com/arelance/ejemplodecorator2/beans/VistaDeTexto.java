/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplodecorator2.beans;

/**
 *
 * @author Manuel
 */
public class VistaDeTexto implements ComponenteVisual{

    @Override
    public void operacion() {
        System.out.println("Vista de texto");
    }
    
}
