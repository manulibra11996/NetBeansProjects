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
    private String sexo;
    private String provincia;


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
    
    public Sexo[] getValues() {
        return Sexo.values();
    }
    public enum Sexo {
    HOMBRE("hombre"),MUJER("Mujer");

    private Sexo(String descripcion) {
        this.descripcion = descripcion;
    }
     
    private String descripcion;
   
    
    
    public String getDescripcion(){
        return descripcion;
    }
    
}
    public Provincia[] getProvincias(){
    return Provincia.values();
    
    }

}
