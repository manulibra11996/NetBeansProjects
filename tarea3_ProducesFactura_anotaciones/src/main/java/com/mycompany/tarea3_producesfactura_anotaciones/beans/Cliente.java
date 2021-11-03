/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 *
 * @author manuel
 */
@Named(value = "cliente")
@RequestScoped
public class Cliente {

    @NotNull(message = "El nombre no puede ser nulo")
    private String nombre = "Gabriel";
    @NotNull(message = "El email no puede estar vacío")
    @Email(message = "Email debe ser válido")
    private String email = "aaa@bbb";
    @NotNull(message = "El apellido no puede ser nulo")
    private String apellidos = "Gomez";


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String nombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }
}
