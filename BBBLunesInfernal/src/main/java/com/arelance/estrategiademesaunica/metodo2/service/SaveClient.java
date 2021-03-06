/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.estrategiademesaunica.metodo2.service;

import com.arelance.estrategiademesaunica.metodo2.domains.NonTeachingStaff2;
import com.arelance.estrategiademesaunica.metodo2.domains.TeachingStaff2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class SaveClient {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        //Teaching staff entity 
        TeachingStaff2 ts1 = new TeachingStaff2(1, "Gopal", "MSc MEd", "Maths");
        TeachingStaff2 ts2 = new TeachingStaff2(2, "Manisha", "BSc BEd", "English");

        //Non-Teaching Staff entity
        NonTeachingStaff2 nts1 = new NonTeachingStaff2(3, "Satish", "Accounts");
        NonTeachingStaff2 nts2 = new NonTeachingStaff2(4, "Krishna", "Office Admin");

        //storing all entities
        entitymanager.persist(ts1);
        entitymanager.persist(ts2);
        entitymanager.persist(nts1);
        entitymanager.persist(nts2);

        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
    }
}
