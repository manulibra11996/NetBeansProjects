/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imagenperdido.servicio;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author manuel
 */
@Alternative
public class Imprimir1 implements InterfaceImprimir {

    @Override
    public String mostrar() {
        return "Imprimir 1";
    }

}