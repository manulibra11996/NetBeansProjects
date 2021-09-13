/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.main;

import com.arelance.libreriafinal.beans.DatosPersonales;
import com.arelance.libreriafinal.beans.LecturaArchivos;
import com.arelance.libreriafinal.menus.MenuPrincipal;
import com.arelance.libreriafinal.beans.Libro;
import com.arelance.libreriafinal.beans.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author manulibra
 */
public class Main {
    
    Map<Usuario, DatosPersonales> listUsers = new HashMap<>();
    Map<Libro, Set<Usuario>> listBooks = new HashMap<>();
    static Main main = new Main();
    
    public Map<Usuario, DatosPersonales> getListUsers() {
        return listUsers;
    }

    public void setListUsers(Map<Usuario, DatosPersonales> listUsers) {
        this.listUsers = listUsers;
    }

    public Map<Libro, Set<Usuario>> getListBooks() {
        return listBooks;
    }

    public void setListBooks(Map<Libro, Set<Usuario>> listBooks) {
        this.listBooks = listBooks;
    }
   
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        LecturaArchivos la = new LecturaArchivos();
        MenuPrincipal mp = new MenuPrincipal();      
        
        
        la.lecturaArchivos(main);
        mp.menuPrincipal(main);
    }

   

    
}
