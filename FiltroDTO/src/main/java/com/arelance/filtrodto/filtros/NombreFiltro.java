/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.filtros;

import com.arelance.filtrodto.dtos.Filtro;
import java.util.Iterator;

/**
 *
 * @author Manuel
 */
public class NombreFiltro extends Filtro{

    private String nombre;
    
    public NombreFiltro(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String execute() {
        for (Iterator<Filtro> iterator = filtros.iterator(); iterator.hasNext();) {
            Filtro next = iterator.next();
            
            sqlSentence = sqlSentence + next.execute();
           
        }
        sqlSentence = sqlSentence + "nombre = " + nombre;
        return sqlSentence;
    }
    
}
