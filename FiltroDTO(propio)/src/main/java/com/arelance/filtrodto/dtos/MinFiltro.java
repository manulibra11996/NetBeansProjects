/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.dtos;

import java.util.Iterator;

/**
 *
 * @author Manuel
 */
public class MinFiltro extends Filtro{
    
    private String minimo;

    public MinFiltro(String minimo) {
        this.minimo = minimo;
    }
    
    @Override
    public String execute() {
        for (Iterator<Filtro> iterator = filtros.iterator(); iterator.hasNext();) {
            Filtro next = iterator.next();
            
            sqlSentence = sqlSentence + next.execute();
            
        }
        sqlSentence = sqlSentence + "edad>=" + minimo;
        return sqlSentence;
    }
    
}
