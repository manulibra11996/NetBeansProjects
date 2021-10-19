/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.modelo;

import com.arelance.lunesdivino.services.CRUDRepository;

/**
 *
 * @author Admin
 */
public enum Controller {

    MAINCONTROLLER;
    private CRUDRepository cRUDRepository = new CRUDRepository();

    public boolean altaLibro(Libro libro) {
        return cRUDRepository.add(libro);
    }

}
