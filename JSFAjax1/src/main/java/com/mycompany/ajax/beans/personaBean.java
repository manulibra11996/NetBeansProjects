/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ajax.beans;

import java.io.Serializable;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named
@ViewScoped
public class personaBean implements Serializable {

    private String nombre;
    private String contraseña;
    private String contraseña2;
    private String errorMensajeName;
    private String errorMensajeContraseña;
    private String errorMensajeContraseña2;

    public String getErrorMensajeContraseña2() {
        return errorMensajeContraseña2;
    }

    public void setErrorMensajeContraseña2(String errorMensajeContraseña2) {
        this.errorMensajeContraseña2 = errorMensajeContraseña2;
    }

    
    public String getErrorMensajeContraseña() {
        return errorMensajeContraseña;
    }

    public void setErrorMensajeContraseña(String errorMensajeContraseña) {
        this.errorMensajeContraseña = errorMensajeContraseña;
    }

    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getErrorMensajeName() {
        return errorMensajeName;
    }

    public void setErrorMensajeName(String errorMensajeName) {
        this.errorMensajeName = errorMensajeName;
    }

    public void validarNombre() {
        if (nombre.length() < 4) {
            errorMensajeName = "El nombre tiene menos de  4 caracteres";
            return;
        }
        if (nombre.length() > 8) {
            errorMensajeName = "El nombre tiene mas de 8 caracteres";
            return;
        }
        errorMensajeName = "";
    }

    public void validarContraseña() {
        if (contraseña.length() < 4) {
            errorMensajeContraseña = "La contraseña tiene menos de  4 caracteres";
            return;
        }
        if (contraseña.length() > 8) {
            errorMensajeContraseña = "La contraseña tiene mas de 8 caracteres";
            return;
        }
        errorMensajeContraseña = "";
    }
    
    public void validarContraseña2() {
        if (contraseña2.length() < 4) {
            errorMensajeContraseña2 = "La contraseña tiene menos de  4 caracteres";
            return;
        }
        if (contraseña2.length() > 8) {
            errorMensajeContraseña2 = "La contraseña tiene mas de 8 caracteres";
            return;
        }
        errorMensajeContraseña = "";
    }
    
    public void comprobarContraseña() {
        if (contraseña.equals(contraseña2)) {
            errorMensajeContraseña = "Las dos contraseñas coinciden";
            return;
        }
    }
}
