package com.mycompany.pueba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author salvador
 */
@Named(value = "persona")
@RequestScoped
public class Persona {

    private String nombre;
    private String email;
    private String sexo = "Mujer";

    private String[] marcaTelefoMovil;
    
    private String provincia;
    
    private String actividad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Creates a new instance of Persona
     */
    public Persona() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the marcaTelefoMovil
     */
    public String[] getMarcaTelefoMovil() {
        return marcaTelefoMovil;
    }

    /**
     * @param marcaTelefoMovil the marcaTelefoMovil to set
     */
    public void setMarcaTelefoMovil(String[] marcaTelefoMovil) {
        this.marcaTelefoMovil = marcaTelefoMovil;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
    public Sexo[] getValues() {
        return Sexo.values();
    }
    
    public Movil[] getValuesMovil() {
        return Movil.values();
    }
    
    public Provincia[] getValuesProvincia() {
        return Provincia.values();
    }
    
    public Actividad[] getValuesActividad() {
        return Actividad.values();
    }

//    public enum Sexo {
//        HOMBRE("hombre"), MUJER("Mujer");
//
//        private String descripcion;
//
//        private Sexo(String descripcion) {
//            this.descripcion = descripcion;
//        }
//
//        public String getDescripcion() {
//            return descripcion;
//        }
//
//    }

}
