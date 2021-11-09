/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imagenperdido.cliente;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.mycompany.imagenperdido.servicio.InterfaceImprimir;


/**
 *
 * @author manuel
 */
@Named
@RequestScoped
public class Controler {
   
    @Inject
    private InterfaceImprimir imprimir;

    public InterfaceImprimir getInterfaceImprimir() {
        return imprimir;
    }

   
}