package com.mycompany.validaciones_jsf_2.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Model;


@Model
public class Candidato {
    
    private String nombre;
    private String apellido;
    private String salario;
    Logger log=Logger.getGlobal();
  
    public Candidato() {
        log.info("Creando el candidato");
    //    this.setNombre("introduce tu nombre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
          log.info("modificando el nombre:"+this.nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
            log.info("modificando el nombre:"+this.apellido);
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
            log.info("modificando el nombre:"+this.salario);
    }
    
    
}
