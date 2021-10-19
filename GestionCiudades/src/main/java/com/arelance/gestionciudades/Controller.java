/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.gestionciudades;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Controller {

    private final int MAXIMO = 4;
    private String[] ciudades = new String[MAXIMO];
    private int contador = -1;

    public boolean alta(String ciudad) {
        if (contador < ciudades.length - 1) {
            ciudades[++contador] = ciudad;
            return true;
        }
        return false;
    }

    public boolean baja(Integer index) {
        System.arraycopy(this, index, this, MAXIMO, index);
        return true;
    }

    public static void main(String[] args) {
//        Controller controller=new Controller();
//        System.out.println(controller.alta("Paris"));
//        System.out.println(controller.alta("Barcelona"));
//        System.out.println(controller.alta("Madrid"));
//        System.out.println(controller.alta("Sevilla"));
//        System.out.println(controller.alta("Tokio"));

//            int[] source = {1,2,3,4,5};
//            int[] dest = {6,7,8,9,10};
//            System.arraycopy(source, 2, source, 0, source.length-2);
//            Integer[] src = {1,2,3,4,5};
//            Integer[] dest = new Integer[5];
//            System.arraycopy(src, 1, dest, 1, 2);
//            Integer[] src = {1,2,3,4};
//            Integer[] dest = new Integer[5];
//            System.arraycopy(src, 1, dest, dest.length-2, 2);
//            Integer[] src = {1,2,3,4};
//            Integer[] dest = new Integer[8];
//            System.arraycopy(src, 0, dest, dest.length/2, src.length);
//            for (Integer integer : dest) {
//                System.out.println(integer);
//            }
//            
//            String[][] datos = new String[3][];
//            datos[0]= new String[]{"Isi","1234"};
//            datos[1]= new String[]{"Salva","4567"};
//            datos[2]= new String[]{"Antonio","abcd"};
//            String[][] dest = new String[datos.length][];
//            System.arraycopy(datos, 0, dest, 0, datos.length);
//            
//            String[][] source = new String[4][];
//            source[0]= new String[]{"Isi","Cadiz"};
//            source[1]= new String[]{"Salva","Sevilla"};
//            source[2]= new String[]{"Antonio","Sevilla"};
//            source[3]= new String[]{"Grabriel","Sevilla"};
//            String[][] dest = new String[10][];
//            System.arraycopy(source, 1, dest, 0, source.length-1);
//            
//            char a = 97;
//            System.out.println(a);
        String[][] contactos = new String[1][3];
        Scanner teclado = new Scanner(System.in);
        String[] datos = {"Nombre:", "Apellidos", "Telefono"};

        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                System.out.println("Introduce el " + datos[j]);
                contactos[i][j] = teclado.nextLine();
            }
        }

        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                System.out.println(datos[j]);
                System.out.println(contactos[i][j]);
            }
        }
    }

}
