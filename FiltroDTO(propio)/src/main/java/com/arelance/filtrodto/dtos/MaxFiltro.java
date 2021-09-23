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
public class MaxFiltro extends Filtro{
    
    private String maximo;

    public MaxFiltro(String maximo) {
        this.maximo = maximo;
    }
    
    @Override
    public String execute() {
        for (Iterator<Filtro> iterator = filtros.iterator(); iterator.hasNext();) {
            Filtro next = iterator.next();
            
            sqlSentence = sqlSentence + next.execute();
            
        }
        sqlSentence = sqlSentence + "edad<=" + maximo;
        return sqlSentence;
    }
    
}
