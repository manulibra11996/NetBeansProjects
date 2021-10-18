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
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.arelance.a_trolllunesthurnder.domains.Item;

/**
 *
 * @author salvador
 */
public class test_groupby {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("criteria_samples");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);

        Root<Item> root = criteriaQuery.from(Item.class);
        criteriaQuery.select(criteriaBuilder.count(root.get("itemPrice"))).groupBy(root.get("itemPrice")).
                having( criteriaBuilder.gt(criteriaBuilder.count(root.get("itemPrice")), 1));

        TypedQuery<Long> typedQuery = em.createQuery(criteriaQuery);
        List<Long> lista = typedQuery.getResultList();

        //  Item_.itemName.
        for(Long d:lista){
        System.out.println(d);
        }

    }
}
