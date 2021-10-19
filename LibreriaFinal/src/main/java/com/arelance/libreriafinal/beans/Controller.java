/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.beans;

import com.arelance.libreriafinal.main.Main;
import com.arelance.libreriafinal.services.CRUDRepositorio;
import com.arelance.libreriafinal.vistas.VistaDatosLogin;
import com.arelance.libreriafinal.vistas.ViewDatos;
import com.arelance.libreriafinal.vistas.ViewLibro;
import com.arelance.libreriafinal.vistas.ViewUsuario;
import com.arelance.libreriafinal.vistas.VistaObtenerLibro;
import com.arelance.libreriafinal.vistas.VistaRegistroDatosPersonales;
import com.arelance.libreriafinal.vistas.VistaRegistroUsuario;
import java.io.IOException;

/**
 *
 * @author manulibra
 */
public class Controller {

    private CRUDRepositorio repositorio = new CRUDRepositorio();
    private ViewUsuario viewUsuario;
    private ViewDatos viewDatos;
    private ViewLibro viewLibro;

    public boolean registrarUsuario() {
        viewUsuario = new VistaRegistroUsuario();
        viewDatos = new VistaRegistroDatosPersonales();
        Usuario usuario = viewUsuario.getData();
        DatosPersonales dp = viewDatos.getData();
        return repositorio.add(usuario, dp);
    }

    public boolean loginUsuario() {
        viewUsuario = new VistaDatosLogin();
        Usuario usuario = viewUsuario.getData();
        return repositorio.login(usuario);
    }

    public void salida(Main main) throws IOException {
        repositorio.salir(main);
    }

    public void desLoginUsuario() {
        repositorio.desLogin();
    }

    public boolean alquiler() {
        viewLibro = new VistaObtenerLibro();
        Libro libro = viewLibro.getData();
        return repositorio.libroA(libro);
    }

    public boolean devolucion() {
        viewLibro = new VistaObtenerLibro();
        Libro libro = viewLibro.getData();
        return repositorio.libroD(libro);
    }
}
