/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolllunesthurnder.controler;

import com.arelance.a_trolllunesthurnder.domains.Item;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel
 */
public class ejemplaresItem {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("criteria_samples");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Item i1 = new Item();
        i1.setItemName("xxx");
        i1.setItemDescription("xxx");
        i1.setItemPrice(25);

        Item i2 = new Item();
        i2.setItemName("yyy");
        i2.setItemDescription("yyy");
        i2.setItemPrice(30);

        em.persist(i1);
        em.persist(i2);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
