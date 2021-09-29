/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.test;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.Asignatura;
import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntityAsig;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class AsigCascade {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        StudentEntityAsig sea1 = new StudentEntityAsig();
        sea1.setId(101);
        sea1.setName("Vipul");
        sea1.setAge(20);

        StudentEntityAsig sea2 = new StudentEntityAsig();
        sea2.setId(102);
        sea2.setName("Aman");
        sea2.setAge(22);

        Asignatura sb1 = new Asignatura();
        sb1.setName("ENGLISH");
        sb1.setHours(80);
        sb1.setId(1);

        Asignatura sb2 = new Asignatura();
        sb2.setName("Maths");
        sb2.setHours(75);
        sb2.setId(2);

        sea1.setAsig(sb1);
        sea2.setAsig(sb2);

        em.persist(sea1);
        em.persist(sea2);

        em.getTransaction().commit();
        
        StudentEntityAsig s1 = em.find(StudentEntityAsig.class, 101);

        System.out.println("Id. De estudiante = " + s1.getId());
        System.out.println("Nombre del estudiante = " + s1.getName());
        System.out.println("Edad del estudiante = " + s1.getAge());
        System.out.println("Asignatura del estudiante = " + s1.getAsig().getName());
       
        StudentEntityAsig s2 = em.find(StudentEntityAsig.class, 102);

        System.out.println("Id. De estudiante = " + s2.getId());
        System.out.println("Nombre del estudiante = " + s2.getName());
        System.out.println("Edad del estudiante = " + s2.getAge());
        System.out.println("Asignatura del estudiante = " + s2.getAsig().getName());

        em.close();
        emf.close();

    }
}
