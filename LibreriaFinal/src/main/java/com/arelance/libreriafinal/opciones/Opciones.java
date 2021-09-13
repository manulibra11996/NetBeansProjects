/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.opciones;

import com.arelance.libreriafinal.beans.Seleccionable;
import com.arelance.libreriafinal.beans.Usuario;
import com.arelance.libreriafinal.vistas.ViewDatos;
import com.arelance.libreriafinal.vistas.ViewUsuario;



/**
 *
 * @author manulibra
 */
public abstract class Opciones implements Seleccionable{
    protected ViewUsuario viewUsuario;
    protected ViewDatos viewDatos;
    protected Usuario usuario;
    
    
    public Opciones(ViewUsuario view) {
        this.viewUsuario = view;
    }
    
    public Opciones(ViewUsuario viewUsuario,ViewDatos viewDatos) {
        this.viewUsuario = viewUsuario;
        this.viewDatos = viewDatos;
    }
    
    @Override
    public void ejecutarOpcion() {
        usuario = viewUsuario.getData();
    }
}
