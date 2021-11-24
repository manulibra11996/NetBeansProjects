/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pueba;



/**
 *
 * @author lenovo
 */


//public class Provincia {
//    private String provinciaPersona;
//
//    public Provincia() {
//      
//    }

//    public String getProvinciaPersona() {
//        return provinciaPersona;
//    }
//
//    public void setProvinciaPersona(String provinciaPersona) {
//        this.provinciaPersona = provinciaPersona;
//    }  
//        public Provincias[] getValues() {
//        return Provincias.values();
//    }
    public enum Provincia {
    SEVILLA("Sevilla"),CORDOBA("Cordoba"),MALAGA("Málaga"),MADRID("Madrid");

    private Provincia(String descripcion) {
        this.descripcion = descripcion;
    }
     
    private String descripcion;
   
    
    
    public String getDescripcion(){
        return descripcion;
    }
    
}

