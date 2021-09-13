/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.beans;


import com.arelance.libreriafinal.main.Main;
import com.arelance.libreriafinal.menus.MenuPrincipal;
import com.arelance.libreriafinal.menus.MenuSecundario;
import com.arelance.libreriafinal.vistas.VistaDatosLogin;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author manulibra
 */
public class BaseDeDatos {
    Main main = new Main();//Esta variable es static porque queremos que siempre mire el mismo sitio en memoria
    private Sesion sesion = Sesion.SESION;
    
    
    public BaseDeDatos() {
        
    }


    
    public void guardar(Main main) throws FileNotFoundException, IOException {
        this.main = main;
        FileOutputStream fos = new FileOutputStream("datosusuarios.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(main.getListUsers());
        oos.close();

        FileOutputStream fos2 = new FileOutputStream("datoslibros.dat");
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        oos2.writeObject(main.getListBooks());
        oos2.close();
    }

    public boolean add(Usuario usuario,DatosPersonales dp) {
        this.main = main;
        Map<Usuario, DatosPersonales> listaUso = main.getListUsers();
        listaUso.put(new Usuario(usuario.getNick(), usuario.getPassword()), new DatosPersonales(dp.getNombre(), dp.getApellido()));
        main.setListUsers(listaUso);
        for (Map.Entry<Usuario, DatosPersonales> entry : main.getListUsers().entrySet()) {
            Usuario key = entry.getKey();
            System.out.println(key);
        }
        return true;
    }

    public boolean login(Usuario usuario) {
        this.main = main;
        MenuSecundario ms = new MenuSecundario();
        VistaDatosLogin login = new VistaDatosLogin();
        sesion.setCurrentUser(login.getData());
        boolean entrada = false;
        for (Map.Entry<Usuario, DatosPersonales> entry : main.getListUsers().entrySet()) {
            Usuario key = entry.getKey();
            if (sesion.getCurrentUser().compareTo(key) == 0) {
                entrada = true;
                ms.menuSecundario();
                return true;
            }
        }
        if (entrada == false) {
            System.out.println("usuario no valido");
        }
        return false;
    }

    public void desLogin() {
        this.main = main;
        MenuPrincipal mp = new MenuPrincipal();
        System.out.println("Cerrando sesion");
        mp.menuPrincipal(main);
    }

    public boolean libroA(Libro libro) {
        this.main = main;
        for (Map.Entry<Libro, Set<Usuario>> entry : main.getListBooks().entrySet()) {
            Libro key = entry.getKey();
            if (entry.getValue().size() <= 3) {
                if (!entry.getValue().contains(sesion.getCurrentUser())) {
                System.out.println(key);
                }
            }
            
        }
         try {
            if (main.getListBooks().get(libro) == null) {
                throw new NullPointerException();
            } else {
                main.getListBooks().get(libro).add(sesion.getCurrentUser());
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("no existe el libro");
        }
        return false;
    }

    public boolean libroD(Libro libro) {
        this.main = main;
        for (Map.Entry<Libro, Set<Usuario>> entry :main.getListBooks().entrySet()) {
            Libro key = entry.getKey();
            if (entry.getValue().contains(sesion.getCurrentUser())) {
                System.out.println(key);
            }
        }
         try {
            if (main.getListBooks().get(libro) == null) {
                throw new NullPointerException();
            } else {
                main.getListBooks().get(libro).remove(sesion.getCurrentUser());
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("no existe el libro");
        }
        return false;
    }
    
   
}
