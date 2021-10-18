/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolllunesthurnder.controler;

import com.arelance.a_trolllunesthurnder.domains.Item;
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
        Query query = entitymanager.createQuery("select count(i)from Item i group by i.itemPrice having count(i) > 1");
        List<Long> list = query.getResultList();

        for (Long e : list) {
            System.out.println(e);
        }

       entitymanager.close();
       emfactory.close();
    }
}
