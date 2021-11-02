/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsf_parameters;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author salvador
 */
@Named(value = "ejemploRequestParmeters")
@RequestScoped
public class EjemploRequestParmeters {

    /**
     * Creates a new instance of EjemploRequestParmeters
     */
    public EjemploRequestParmeters() {
    }

    public void holaString() {
        String hola = getParameter("holaString");
        String saludoFormal = getParameterWithMap("saludoFormal");
        if (hola != null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("la cadena de saludo es:" + hola));
        }
        if (saludoFormal != null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("la cadena de saludo es:" + saludoFormal));
        }
    }

    private String getParameter(String name) {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String dato = request.getParameter(name);
        return dato;
    }

    private String getParameterWithMap(String name) {

        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(name);
    }
}
