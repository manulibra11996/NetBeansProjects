/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.test;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.Address;
import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class list {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Address a1 = new Address();
        a1.setE_pincode(201301);
        a1.setE_city("Noida");
        a1.setE_state("Uttar Pradesh");

        Address a2 = new Address();
        a2.setE_pincode(302001);
        a2.setE_city("Jaipur");
        a2.setE_state("Rajasthan");

        StudentEntity se1 = new StudentEntity();
        se1.setId(1);
        se1.setName("Vijay");
        se1.setAge(50);
        se1.getAddress().add(a1);
        se1.getAddress().add(a2);

        em.persist(se1);

        em.getTransaction().commit();

        StudentEntity s = em.find(StudentEntity.class, 1);

        System.out.println("Id. De estudiante = " + s.getId());
        System.out.println("Nombre del estudiante = " + s.getName());
        System.out.println("Edad del estudiante = " + s.getAge());
        System.out.print("Direccion del estudiante = ");
        for (int i = 0; i < s.getAddress().size(); i++) {
            Address get = s.getAddress().get(i);
            if(i != (s.getAddress().size() - 1 )){
                System.out.print(get.getE_city() + " , ");
            } else {
                System.out.print(get.getE_city());
            }
        }
        em.close();
        emf.close();

    }
}
