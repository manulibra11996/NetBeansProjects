/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pueba;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author salvador
 */
@Named(value = "listaPersonas")
@Dependent
public class ListaPersonas {

   
    private List<Persona> lista=new ArrayList<>();

    /**
     * Creates a new instance of ListaPersonas
     */
    public ListaPersonas() {
    }
    
    @PostConstruct
    public void init(){
        Persona p=new Persona();
        p.setNombre("juan");
        lista.add(p);
    }
    
    
     public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
    
}
