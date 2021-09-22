/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.dtos;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Manuel
 */
public abstract class Filtro {
    
    protected String sqlSentence = "";
    
    protected List<Filtro> filtros = new ArrayList<>();

    public Filtro buiderFiter(Filtro filtro) {
        filtros.addAll(filtro.filtros);
        return this;
    }
    
    
    public abstract String execute();
}
