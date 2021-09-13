/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.telefono;

import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author manulibra
 */
public class PrincipalLogicaVista {
//Variables de la clase
    //Variable para poder recibir datos por teclado
    private static final Scanner teclado = new Scanner(System.in);
    //Variable que indica la posision del contacto
    private static int contador = -1;
    //Array bidimensional donde se guardan los contactos
    private static final String[][] contactos = new String[5][3];
    //Array bidimensional con mensajes para los metodos Buscar y Modificar
    private static final String[][] mensajes = {{"Inserte el nombre del contacto que buscas: ","El contacto que buscas es " },{"Inserte el nombre del contacto que buscas para modificarlo: ","El contacto que vas a modificar es " }};
    //Array bidimensional con todas las opciones
    private static final String[][] opciones = {{"Alta","Listar","Buscar","Modificar","Salir"},{"Nombre","Email","Telefono","Salir"}};
    //Variable que indica si un contacto puede modificarse
    private static boolean mod = true;
    //Variable que le pasa el contacto que buscas para modificar
    private static int buscado = 0;
    private static int mensaje;
    private static int vuelta;
    
    //Metodos de la clase
        //Metodo principal
        public static void main(String[] args) {
        //Variables del metodo
            //Variable que guarda la opcion que seleccionas
            int opcion;
            
            //Bucle infinito para que selecciones una de las opciones propuestas
            while (true) {
                System.out.println(" ");
                //Metodo que muestra un mensaje por pantalla indicando el principio del menu
                System.out.println("Elije una opcion:");
                //Lamando al metodo llamado Opciones con el valor de la variable 0
                opciones(0);
                //Se le asigna a la variable opcion un numero pasado por teclado
                opcion = teclado.nextInt();
                //Se comprueba la variable con una instruccion donde se puede 
                //ejecutar multiples codigos dependiendo de lo que le indiques
                switch(opcion){
                    //Opcion numero 1: Da de alta a un nuevo contacto
                    case 1:
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        mensaje(anadirContacto(recogidaDatos()));
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Sale de esta opcion
                        break;
                    //Opcion numero 2: Mostrar una lista de los contatos introducidos
                    case 2:
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Ejecutamos el metodo mostrarContactos
                        mostrarContactos();
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Sale de esta opcion
                        break;
                    //Opcion numero 3: Busca un contacto en concreto
                    case 3:
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Ejecutamos el metodo buscarContactos
                        mensaje(buscarContacto(recibirNombre(0, 0)));
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Sale de esta opcion
                        break;
                    //Opcion numero 4: Modifica un contacto en concreto
                    case 4:
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Ejecutamos el metodo modificarContactos
                        mensaje(modificarContacto());
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Sale de esta opcion
                        break;
                    //Opcion numero 5: Salir del programa
                    case 5:
                        //Metodo que hace que finalice el programa por completo
                        System.exit(0);
                    //Opcion default: Se ejecuta si se pide una opcion no valida
                    default:
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                        //Muesta un mensaje por pantalla
                        System.out.println("Opcion no valida");
                        //Inserta una cadena de texto vacia
                        System.out.println(" ");
                }
            }
    }
    
    
    
    
    //Metodo Opciones: Indica las opciones que tiene el menu con una variable 
    //para mostrar las opciones que queremos mostrar
    public static void opciones(int menu){
    //Variables del metodo
        //Variable que muesta el numero de las opciones
        int numOpcion = 1;
        //Array con los nombres de todas las opciones que se guardan en un array bidimensional
        String[] numOpciones = opciones[menu];
        
        //Bucle para mostrar el numero de la opcion con lo que realiza
        for (String opcion : numOpciones) {
            //Muesta el mensaje con el numero de opcion y lo que realiza
            System.out.println("Opcion " + numOpcion + ": " + opcion);
            //Aumenta en 1 el valor de numOpcion
            numOpcion++;
        }
//        for (int i = 0; i < numOpciones.length; i++) {
//            String opcion = numOpciones[i];
//            System.out.println("Opcion " + numOpcion + ": " + opcion);
//            numOpcion++;
//        }
    }
    
    //Metodo anadirContacto: Permite la creacion de contactos nuevos, con la devolucion de
    //un array con la informacion del nuevo contacto
    public static boolean anadirContacto(String[] recibidos){
    //Variables del metodo
        //Array con los datos introducidos para añadirlos al array contactos
        String[] introducidos = new String[3];
        mensaje = 1;
        if(++contador < contactos.length){
            introducidos = recibidos;
            contactos[contador]=introducidos;
            return true;
        }
        
        return false;
    }
    
    public static String[] recogidaDatos(){
    //Variables del metodo
        //Array con los datos solicitados
        String[] datos = {"nombre","email","telefono"};
        //Array con los datos introducidos para añadirlos al array contactos
        String[] recibidos = new String[3];
        
        //Bucle donde indica que dato se pude y lo añade al array introducidos
        for (int i = 0; i < recibidos.length; i++) {
            //Muesta el mensaje con el dato pedido
            System.out.println("Indique el " + datos[i] +": ");
            //Añade al array el valor introducido por teclado
            recibidos[i]=teclado.next();        
            }
        //Devuelve el valor del array introducidos
        return recibidos;
    }
    
    public static void mensaje(boolean correcto){
        switch(mensaje){
            case 1:
                if(correcto){
                    System.out.println("Contacto introducido correctamente");
                }else{
                    System.out.println("Agenda llena");
                }
                break;
            case 2:
                if(correcto){
                    System.out.println("El contacto es " + contactos[buscado][0] + 
                    ", su email es " + contactos[buscado][1] + " y su telefono es " + contactos[buscado][2]);
                }else{
                    System.out.println("El contacto no existe");
                    mod=false;
                }
                break;
            case 3:
                if(correcto){
                    System.out.println("El contacto " + contactos[buscado][0] + " ha sido modificado");
                }
            break;
        }
    }
    //Metodo mostrarContactos: Muestra la lista completa de los contactos introducidos
    public static void mostrarContactos() {
        
        //Bucle donde se van mostrando el numero del contacto con su informacion
        for (String[] contacto : contactos) {
            //Comprueba que el nombre del contacto no sea null
            if(contacto[0] != null){
                //Bucle anidado donde se muestra los datos de los contactos
                for (String contacto1 : contacto) {
                        //Muesta el mensaje con los datos del contacto
                       enseñar(contacto1);
                       salto();
                }
            }
        }
//        for (int i = 0; i < contactos.length; i++) {
//            System.out.print("Contacto nº" + numContacto + ": ");
//            for (int j = 0; j < contactos[i].length; j++) {
//                System.out.print(contactos[i][j] + " ");
//            }
//            numContacto++;
//            System.out.println(" ");
//
//        } 
    }
    
    public static void enseñar(String contacto){
        System.out.print(contacto + " ");
    }
    
    public static void salto(){
       if(vuelta == 2){
           System.out.println(" ");
       }
       vuelta++;
    }
    
    public static void mensajebus(boolean correcto){
        if(correcto){
            System.out.println("El contacto es " + contactos[buscado][0] + 
            ", su email es " + contactos[buscado][1] + " y su telefono es " + contactos[buscado][2]);
        }else{
            System.out.println("El contacto no existe");
            mod=false;
        }

    }
    
    public static String recibirNombre(int mensaje, int opcion){
        System.out.println(mensajes[mensaje][opcion]);
        return teclado.next();
    }
    //Metodo buscarContactos: Busca el contacto que le indiquemos, pasandole el 
    //mensaje que queremos que muestre
    public static boolean buscarContacto(String nombre){
    
        mensaje = 2;
        //Bucle que carga todos los contactos del array
        for (int i = 0; i < contactos.length; i++) {
            //Busca una coincidencia entre el valor de nombre y los valores 
            //que contiene el array en la posicion 0
            if(nombre.equals(contactos[i][0])){
                //Variable que guarda el numero del indice donde se encuentra el 
                //contacto que queremos modificar
                buscado=i;
                //Inserta una cadena de texto vacia
                return true;
            }
           
        }
        
        return false;
    }
    
    public static int opcionesMod(){
        //Inserta una cadena de texto vacia
                System.out.println(" ");
                //Metodo que muestra un mensaje por pantalla indicando el principio del menu
                System.out.println("Elija lo que quiera modificar:");
                //Lamando al metodo llamado Opciones con el valor de variable 1
                opciones(1);
                return teclado.nextInt();
    }
    
    public static String modificador(int buscado,int opcion){
        switch(opcion){
                    case 1:
                        System.out.println("El contacto cuyo nombre es " + contactos[buscado][0] + " se va a cambiar por ");
                        return teclado.next();
                    case 2:
                        System.out.println("El contacto cuyo email se " + contactos[buscado][1] + " se va a cambiar por ");
                        return teclado.next();
                    case 3:
                        System.out.println("El contacto cuyo telefono es " + contactos[buscado][2] + " se va a cambiar por ");
                       return teclado.next();
                }
        return "Salida";
    }
    
    public static void mensajeMod(boolean correcto){
        if(correcto){
            System.out.println("El contacto " + contactos[buscado][0] + " ha sido modificado");
        }

    }
    //Metodo modificarContactos: Permite modificar el contacto que le indiquemos
    public static boolean modificarContacto(){
        int opcion;
        
        
        //Carga el medoto buscar contactos con los mensajes que queremos que muestre
        buscarContacto(recibirNombre(1, 0));
        mensaje = 3;
        //Comprueba que el contacto se puede modificar
        if (mod) {
            //Un bucle que permite modificar todos los datos que queramos de un contacto
            while (mod) {
                opcion = opcionesMod();
                //Se comprueba la variable con una instruccion donde se puede 
                //ejecutar multiples codigos dependiendo de lo que le indiques
                switch(opcion){
                    //Opcion numero 1: Modificar el nombre
                    case 1:
                        String nombremod = modificador(buscado,opcion);
                        //Modifica el nombre del contacto al pasado por teclado
                        Arrays.asList(contactos[buscado]).set(0, nombremod);
                        //Sale de esta opcion
                        break;
                    case 2:
                        String emailmod = modificador(buscado,opcion);
                        //Modifica el email del contacto al pasado por teclado
                        Arrays.asList(contactos[buscado]).set(1, emailmod);
                        //Sale de esta opcion
                        break;
                    case 3:
                        String telefonomod = modificador(buscado,opcion);
                        //Crea una variable y le asigna el valor de un telefono pasado por teclado
                        Arrays.asList(contactos[buscado]).set(2, telefonomod);
                        //Sale de esta opcion
                        break;
                    case 4:
                        //Muestra este mensaje por pantalla
                        System.out.println("Ya as acabado de modificar el contacto");
                        // Modifica el valor de la variable mod para que salga del bucle
                        mod = false;
                        //Sale de esta opcion
                        break;
                    default:
                        //Muestra este mensaje por pantalla
                        System.out.println("Opción no valida");
                }
                return true;
            }
            //Fuera del bucle pongo true a mod para poder modificar otro contacto
            mod = true;
        }
        return false;
    }
}

