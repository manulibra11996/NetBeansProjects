/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.brutalzone;

import com.arelance.Beans.Empleado;
import com.arelance.Beans.Persona;
import java.util.*;
import java.util.function.Consumer;
import com.arelance.brutalzone.EjemploConsumer;

/**
 *
 * @author Manuel
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe");
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Juan");
        
        System.out.printf("Comparando p1 y p2: %s %n", p1.compareTo(p2));
        System.out.printf("Comparando p1 y p1: %s %n", p1.compareTo(p1));
        System.out.printf("Comparando p1 y p3: %s %n", p1.compareTo(p3));
        
        Empleado e1 = new Empleado("Pepe", 1200f);
        Empleado e2 = new Empleado("Ana", 1300f);
        Empleado e3 = new Empleado("Juan", 1000f);
        
        System.out.printf("Comparando e1 y e2: %s %n", e1.compareTo(e2));
        System.out.printf("Comparando e1 y e1: %s %n", e1.compareTo(e1));
        System.out.printf("Comparando e1 y e3: %s %n", e1.compareTo(e3));
        
        List<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p2);
        
        List<Empleado> listaEmp = new ArrayList<>();
        listaEmp.add(e1);
        listaEmp.add(e2);
        listaEmp.add(e3);
        listaEmp.add(e2);
        
        
        Collections.sort(lista);
        
//        lista.forEach(new EjemploConsumer());
        
//        lista.forEach(new Consumer<Persona>() {
//            @Override
//            public void accept(Persona t) {
//                System.out.println(t.getNombre());
//            }
//        });
//        
//        lista.forEach((Persona t) -> System.out.println(t.getNombre()));
        
        Collections.reverse(lista);
        
        lista.forEach(t -> {
            if(t instanceof Empleado){
                Empleado aux = (Empleado) t;
                System.out.println(aux.getNombre()+ " " + aux.getSalario());    
            }else{
                System.out.println(t.getNombre());
            }
        }
        );

        Collections.reverse(lista);
        
        int index = Collections.binarySearch(lista, new Persona("Ana"));
        
        if (index >= 0) {
            System.out.printf("Lo he encontrado en la posicion %s %n", index);
            lista.get(index);
        }else{
            System.out.println("No lo he encontrado");
        }
       
    
        
        Collections.sort(listaEmp);
    
        Collections.reverse(listaEmp);
        
        listaEmp.forEach( e -> System.out.println(e.getNombre() + " " + e.getSalario()));
        
        Collections.reverse(listaEmp);
        
        int indexEmp = Collections.binarySearch(listaEmp, new Empleado("Ana"));
        
        if (indexEmp >= 0) {
            System.out.printf("Lo he encontrado en la posicion %s %n", index);
            listaEmp.get(indexEmp);
        }else{
            System.out.println("No lo he encontrado");
        }
       
    }
    
}
class EjemploConsumer implements Consumer<Persona>{

    @Override
    public void accept(Persona t) {
        System.out.println(t.getNombre());
    }

    
}
