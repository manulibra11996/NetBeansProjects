/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionbiblioteca.views;

import com.arelance.gestionbiblioteca.beans.Usuario;
import java.util.Scanner;

/**
 *
 * @author Gabri
 */
public class RecogerDatosUsuario implements View {

    @Override
    public Usuario getData() {
        Usuario usuario;
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = sn.next();
        System.out.println("Introduzca su apellido");
        String apellido = sn.next();
        System.out.println("Introduzca un nick de usuario");
        String nick = sn.next();
        System.out.println("Introduzca una contraseña");
        String password = sn.next();
        usuario = new Usuario(nombre, apellido, nick, password);
        return usuario;
    }

}
