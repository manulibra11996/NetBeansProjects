/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplomapas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Manuel
 */
public class Main{
//    public static void main(String[] args) {
//        Map<String,Persona> map = new HashMap<>();
//        
//        map.put("uno", new Persona("Pepe","Botella"));
//        map.put("dos", new Persona("Ana","Torroja"));
//        map.put("tres", new Persona("Manolo","Garcias"));
//        map.put("cuatro", new Persona("Juan","Perro"));
//        
//        System.out.println("Tamaño " + map.size());
//        System.out.println("Valor " + map.get("uno"));
//        Set<String> set = map.keySet();
//        if(!set.isEmpty()){
//            Iterator<String> iter = set.iterator();
//           
//            while (iter.hasNext()) {
//                iter.next().concat("loque sea");
//                
//            }
//        }
//        
//        
//        for (String string : set) {
//            System.out.println(string);
//        }
//        
//        
//        System.out.println(map.get(new String("tres")));
//        map.values().remove(new Persona("Juan","Perro"));
//        Set<String> keys = map.keySet();
//        System.out.println("Valor " + map.get("uno"));
//                        
//        for(Entry<String, Persona> entry : map.entrySet()){
//            System.out.println(entry.getKey());
//            
//        }
//        
//        for (Entry<String, Persona> entry : map.entrySet()) {
//            String key = entry.getKey();
//            Persona val = entry.getValue();
//            
//        }
//        
//    }
//    public static void main(String[] args) {
//        Map<Persona,Set<Informe>> informesMap = new HashMap<>();
//        
//        Persona p = new Persona("Pepe","Botella");
//        Set<Informe> informes = new HashSet<>();
//        
//        informes.add(new Informe("informe uno"));
//        informes.add(new Informe("informe dos"));
//        informes.add(new Informe("informe tres"));
//        
//        informesMap.put(p, informes);
//        
//        for (Entry<Persona, Set<Informe>> entry : informesMap.entrySet()) {
//            Persona key = entry.getKey();
//            key = new Persona("Manolo","Garcias");
//            key = entry.getKey();
//            Set<Informe> value = entry.getValue();
//            System.out.println(key);
//            for (Iterator<Informe> iterator = informes.iterator(); iterator.hasNext();) {
//                Informe next = iterator.next();
//                System.out.println(next.getDescripcion());
//            
//            }
//        }
//        
//        Set<Informe> informeFinal = informesMap.get(new Persona("Pepe","Botella"));
//        System.out.println("");
//    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepe","Botella"));
        personas.add(new Persona("Pepe","Martin"));
        
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(personas);
        
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        List<Persona> personasLeidas = (List<Persona>) ois.readObject();
        
        personasLeidas.forEach(p->System.out.println(p));
        
        
        ois.close();
        oos.close();
    }
}
