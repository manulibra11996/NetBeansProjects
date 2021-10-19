package com.arelance.aaa_brutalzonejpatutorialpoint_normal;

import com.arelance.aaa_brutalzonejpatutorialpoint_normal.entity.StudentEntityList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel
 */
public class PersistStudent {

    public static void main(String args[]) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        StudentEntityList s1 = new StudentEntityList();
        s1.setId(101);
        s1.setName("Gaurav");
        s1.setAge(24);

        StudentEntityList s2 = new StudentEntityList();
        s2.setId(102);
        s2.setName("Ronit");
        s2.setAge(22);

        StudentEntityList s3 = new StudentEntityList();
        s3.setId(103);
        s3.setName("Rahul");
        s3.setAge(26);

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        em.getTransaction().commit();

        emf.close();
        em.close();

    }

}
