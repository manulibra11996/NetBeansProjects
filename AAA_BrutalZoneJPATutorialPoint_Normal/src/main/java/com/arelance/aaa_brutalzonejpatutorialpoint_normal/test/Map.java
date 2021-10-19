/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_brutalzonejpatutorialpoint_normal.test;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.Address;
import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntityMaps;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class Map {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Address a1 = new Address();
        a1.setE_pincode(201302);
        a1.setE_city("Noida");
        a1.setE_state("Uttar Pradesh");

        Address a2 = new Address();
        a2.setE_pincode(302001);
        a2.setE_city("Jaipur");
        a2.setE_state("Rajasthan");

        Address a3 = new Address();
        a3.setE_pincode(133301);
        a3.setE_city("Chandigarh");
        a3.setE_state("Punjab");

        Address a4 = new Address();
        a4.setE_pincode(80001);
        a4.setE_city("Patna");
        a4.setE_state("Bihar");

        StudentEntityMaps sem1 = new StudentEntityMaps();
        sem1.setId(2);
        sem1.setName("William");
        sem1.setAge(20);

        sem1.getMap().put(1, a1);
        sem1.getMap().put(2, a2);
        sem1.getMap().put(3, a3);
        sem1.getMap().put(4, a4);

        em.persist(sem1);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
