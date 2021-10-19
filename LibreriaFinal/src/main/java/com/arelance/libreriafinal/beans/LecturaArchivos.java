/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.beans;

import com.arelance.libreriafinal.main.Main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author manulibra
 */
public class LecturaArchivos {

    public void lecturaArchivos(Main main) throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("datosusuarios.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<Usuario, DatosPersonales> usuariosLeidos = (Map<Usuario, DatosPersonales>) ois.readObject();
        //usuariosLeidos.keySet().forEach(p -> System.out.println(p));
        main.setListUsers(usuariosLeidos);
        ois.close();
        FileInputStream fis2 = new FileInputStream("datoslibros.dat");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        Map<Libro, Set<Usuario>> librosLeidos = (Map<Libro, Set<Usuario>>) ois2.readObject();
        //librosLeidos.keySet().forEach(p -> System.out.println(p));
        main.setListBooks(librosLeidos);
        ois2.close();

        if (main.getListBooks().isEmpty()) {
            Map<Libro, Set<Usuario>> listaLibros = main.getListBooks();
            listaLibros.put(new Libro("libro1", "0001"), new HashSet<>());
            listaLibros.put(new Libro("libro2", "0002"), new HashSet<>());
            listaLibros.put(new Libro("libro3", "0003"), new HashSet<>());
            listaLibros.put(new Libro("libro4", "0004"), new HashSet<>());
            listaLibros.put(new Libro("libro5", "0005"), new HashSet<>());
            main.setListBooks(listaLibros);
        }
    }
}
