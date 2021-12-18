/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pueba;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author lenovo
 */
@ManagedBean
@Named(value="actividad")
@RequestScoped
public class Actividad {
    private String actividadesPreferidas;
    private Map<String, Object> listaActividad;
    @PostConstruct
    public void init(){
    	listaActividad = new LinkedHashMap<>();
        listaActividad.put("Ir al cine","Ir al cine");
        listaActividad.put("Ir al gym","Ir al gym");
        listaActividad.put("Jugar videojuegos","Jugar videojuegos");
        listaActividad.put("Dormir","Domir");
    }

    public String getActividadesPreferidas() {
        return actividadesPreferidas;
    }

    public void setActividadesPreferidas(String actividadesPreferidas) {
        this.actividadesPreferidas = actividadesPreferidas;
    }

  
    

    public Map<String, Object> getListaActividad() {
        return listaActividad;
    }

    public void setListaActividad(Map<String, Object> listaActividad) {
        this.listaActividad = listaActividad;
    }
    
    
}
