/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.validaciones_jsf_2.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author salvador
 */
@Named(value = "vacanteForm")
@RequestScoped
public class VacanteForm {
    @Inject
    private Candidato candidato;
    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
    }
    
    public String enviar(){
        String retorno="enviar";
        if(candidato.getNombre().toLowerCase().equals("juan") && candidato.getApellido().toLowerCase().equals("perez")){
            String msg="gracias, pero Juan Perez ya trabaja con nosotros";
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg) );
            retorno="index";
        }
        return retorno;
    }
}
