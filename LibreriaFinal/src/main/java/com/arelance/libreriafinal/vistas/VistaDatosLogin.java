/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.vistas;

import com.arelance.libreriafinal.beans.Usuario;
import java.util.Scanner;


/**
 *
 * @author manulibra
 */
public class VistaDatosLogin implements ViewUsuario{

    @Override
    public Usuario getData() {
        Usuario usuario;
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduzca un nick de usuario");
        String nick = sn.next();
        System.out.println("Introduzca una contraseña");
        String password = sn.next();
        usuario=new Usuario(nick, password);
        return  usuario;
    }
    
}
