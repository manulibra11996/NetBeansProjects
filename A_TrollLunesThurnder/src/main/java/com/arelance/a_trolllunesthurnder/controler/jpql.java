/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolllunesthurnder.controler;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
public class jpql {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("criteria_samples");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Scalar function
        Query query = entitymanager.createQuery("select count(i.itemPrice)from Item i group by i.itemPrice having count(i.itemPrice) > 1");
        List<Object[]> list = query.getResultList();

        for (Object[] objects : list) {
            for (Object object : objects) {
                System.out.print(object);
            }
            System.out.print("--");
        }

        entitymanager.close();
        emfactory.close();
    }
}
