/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;


public class ClienteBuilder2 {

    private String nombre;
    private String email;
    private String apellidos;

    public ClienteBuilder2() {
    }

    public ClienteBuilder2 setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder2 setEmail(String email) {
        this.email = email;
        return this;
    }

    public ClienteBuilder2 setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Cliente createCliente2() {
//        return new Cliente(nombre, email, apellidos);
        return null;
    }
    
}
