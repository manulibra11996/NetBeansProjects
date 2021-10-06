/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ccclunesinfernal.domains.service;

import domains.Clases;
import domains.Maestro;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class ManyToMany {

    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        //Create Clas Entity
        Clases clas1 = new Clases(0, "1st", null);
        Clases clas2 = new Clases(0, "2nd", null);
        Clases clas3 = new Clases(0, "3rd", null);

        //Store Clas
        entitymanager.persist(clas1);
        entitymanager.persist(clas2);
        entitymanager.persist(clas3);

        //Create Clas Set1
        Set<Clases> classSet1 = new HashSet();
        classSet1.add(clas1);
        classSet1.add(clas2);
        classSet1.add(clas3);

        //Create Clas Set2
        Set<Clases> classSet2 = new HashSet();
        classSet2.add(clas3);
        classSet2.add(clas1);
        classSet2.add(clas2);

        //Create Clas Set3
        Set<Clases> classSet3 = new HashSet();
        classSet3.add(clas2);
        classSet3.add(clas3);
        classSet3.add(clas1);

        //Create Maestro Entity
        Maestro teacher1 = new Maestro(0, "Satish", "Java", classSet1);
        Maestro teacher2 = new Maestro(0, "Krishna", "Adv Java", classSet2);
        Maestro teacher3 = new Maestro(0, "Masthanvali", "DB2", classSet3);

        //Store Maestro
        entitymanager.persist(teacher1);
        entitymanager.persist(teacher2);
        entitymanager.persist(teacher3);

        Set<Maestro> teachers = new HashSet();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        Clases clas4 = new Clases(0, "4rd", teachers);

        entitymanager.persist(clas4);

        entitymanager.getTransaction().commit();

//        Clases clase = entitymanager.find(Clases.class, 1);
//
//        System.out.println("Id. de clase = " + clase.getCid());
//        System.out.println("Nombre de la clase = " + clase.getCname());
//        System.out.print("Profesores = ");
//        
//        for (int i = 0; i < clase.getTeacherSet().size(); i++) {
//            Maestro[] profesores = (Maestro[]) clase.getTeacherSet().toArray();
//            Maestro get = (Maestro) profesores[i];
//            if (i != (profesores.length - 1)) {
//                System.out.print(get.getTname()+ " , ");
//            } else {
//                System.out.print(get.getTname());
//            }
//        }
        entitymanager.close();
        emfactory.close();
    }
}
