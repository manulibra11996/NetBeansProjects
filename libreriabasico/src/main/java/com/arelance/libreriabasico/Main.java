/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriabasico;

import com.arelance.libreriabasico.beans.Libro;
import com.arelance.libreriabasico.beans.Usuario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Main {

    Set<Usuario> listUsers = new HashSet<>();
    Set<Libro> listBooks = new HashSet<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.precarga();
        while (true) {
            main.menuPrincipal();
        }
    }

    public void precarga() {

        listUsers.add(new Usuario("juan", "belmonte", "jpelirrojo", "1234"));
        listUsers.add(new Usuario("antonio", "cargo", "nators", "5678"));

    }

    public void menuPrincipal() {
        System.out.println("menu principal");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                Usuario nuevo = registro();
                listUsers.add(new Usuario(nuevo.getNombre(), nuevo.getApellido(), nuevo.getNick(), nuevo.getPassword()));
                System.out.println("registro");
                listUsers.forEach(u -> System.out.println(u));
                break;
            case 2:

                boolean acceso = login();
                if (acceso) {
                    menuSecundario();
                }

                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }

    public void menuSecundario() {
        System.out.println("menu secundario");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                System.out.println("deslogueando");
                menuPrincipal();
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }

    public static Usuario registro() {
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

    private boolean login() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduzca un nick de usuario");
        String nick = sn.next();
        System.out.println("Introduzca una contraseña");
        String password = sn.next();
        Usuario user = new Usuario(nick, password);

        return false;
    }
}
