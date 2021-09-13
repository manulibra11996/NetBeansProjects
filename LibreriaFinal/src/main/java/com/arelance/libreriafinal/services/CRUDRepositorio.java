/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.services;


import com.arelance.libreriafinal.beans.BaseDeDatos;
import com.arelance.libreriafinal.beans.DatosPersonales;
import com.arelance.libreriafinal.beans.Libro;
import com.arelance.libreriafinal.beans.Usuario;
import com.arelance.libreriafinal.main.Main;
import java.io.IOException;


/**
 *
 * @author manulibra
 */
public class CRUDRepositorio {
    private BaseDeDatos baseDeDatos = new BaseDeDatos();

    public boolean add(Usuario usuario,DatosPersonales dp) {
        boolean retValue = false;
        if (usuario != null) {
            retValue = baseDeDatos.add(usuario,dp);
        }
        return retValue;
    }
    
    public boolean login(Usuario usuario) {
        boolean retValue = false;
        if (usuario != null) {
            retValue = baseDeDatos.login(usuario);
        }
        return retValue;
    }
    
    public void salir(Main main) throws IOException {
        baseDeDatos.guardar(main);
        System.exit(0);
    }

    public void desLogin() {
       baseDeDatos.desLogin();
    }

    public boolean libroA(Libro libro) {
        boolean retValue = false;
        if (libro != null) {
            retValue = baseDeDatos.libroA(libro);
        }
        return retValue;
    }

    public boolean libroD(Libro libro) {
        boolean retValue = false;
        if (libro != null) {
            retValue = baseDeDatos.libroD(libro);
        }
        return retValue;
    }

}
