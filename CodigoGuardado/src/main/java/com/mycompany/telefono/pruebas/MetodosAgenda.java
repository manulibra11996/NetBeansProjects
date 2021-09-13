/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.telefono.pruebas;

import com.mycompany.telefono.pruebas.Contactos;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manulibra
 */
public class MetodosAgenda {
    public static final Scanner teclado = new Scanner(System.in);
    private static final Contactos[][] contactos = new Contactos[5][3];
    public static final String[][] mensajes = {{"Inserte el nombre del contacto que buscas: ","El contacto que buscas es " },{"Inserte el nombre del contacto que buscas para modificarlo: ","El contacto que vas a modificar es " }};
    public static boolean mod = true;
    public static int buscado = 0;
    
    public static void Opciones(){
        int numOpcion = 1;
        String[] numOpciones = {"Alta","Buscar","Listar","Modificar","Salir"};
        for (int i = 0; i < numOpciones.length; i++) {
            String opcion = numOpciones[i];
            System.out.println("Opcion " + numOpcion + ": " + opcion);
            numOpcion++;
        }
    }
    
    public static Contactos[] anadirContacto(){
        String[] datos = {"nombre","email","telofono"};
        Contactos[] introducidos = new Contactos[3];
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Indique el " + datos[i] +": ");
            switch(i){
                case 0:
                    String nombre = teclado.next();
                    introducidos[i].setNombre(nombre);
                case 1:
                    introducidos[i].setEmail(teclado.next());
                case 2:
                    introducidos[i].setTelefono(teclado.next());
            }
        }
        return introducidos;
        
    }
    
    public static void mostrarContactos() {
        int numContacto = 1;
        for (int i = 0; i < contactos.length; i++) {
            System.out.print("Contacto nº" + numContacto + ": ");
            for (int j = 0; j < contactos[i].length; j++) {
                System.out.print(contactos[i][j] + " ");
            }
            numContacto++;
            System.out.println(" ");
            
        } 
    }
    
    public static void buscarContacto(int mensaje, int opcion){
        String nombre;
        System.out.println(mensajes[mensaje][opcion]);
        nombre = teclado.next();
        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                if(contactos[i].equals(nombre)){
                    buscado=i;
                    for (int k = 0; k == buscado; k++) {
                        System.out.print(mensajes[mensaje][++opcion] );
                        for (int l = 0; l < contactos[k].length; k++) {
                            System.out.print( contactos[l][k] + " ");
                            
                            break;
                        }
                        System.out.println(" ");
                        break;
                    }
                    break;
                }else{
                    System.out.println("No existe ningun contacto con el nombre de " + nombre);
                    mod = false;
                    break;
                }
            }
            break;
        }
        
    }
    
    public static void OpcionesModificador(){
        int numOpcion = 1;
        String[] numOpciones = {"nombre","email","telefono"};
        for (int i = 0; i < numOpciones.length; i++) {
            String opcion = numOpciones[i];
            System.out.println("Opcion " + numOpcion + ": " + opcion);
            numOpcion++;
        }
    }
     
    public static void modificarContacto(){
        buscarContacto(1,0);
        if (mod) {
             while (mod) {
                 System.out.println("Elija lo que quiera modificar:");
                OpcionesModificador();
                int opcion = teclado.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("El contacto cuyo nombre es " + contactos[buscado][0] + " se va a cambiar por ");
                        String nombremod = teclado.next();
                        contactos[buscado][0].setNombre(nombremod);
                        mod = false;
                        break;
                    case 2:
                        System.out.println("El contacto cuyo email se " + contactos[buscado][1] + " se va a cambiar por ");
                        String emailmod = teclado.next();
                        contactos[buscado][1].setEmail(emailmod);
                        mod = false;
                        break;
                    case 3:
                        System.out.println("El contacto cuyo telefono es " + contactos[buscado][2] + " se va a cambiar por ");
                        String telefonomod = teclado.next();
                        contactos[buscado][2].setTelefono(telefonomod);
                        mod = false;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            }
            
        }
        
    }
}
