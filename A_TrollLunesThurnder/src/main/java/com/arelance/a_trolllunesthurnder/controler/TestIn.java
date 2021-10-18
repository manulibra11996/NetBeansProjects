/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolllunesthurnder.controler;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.arelance.a_trolllunesthurnder.domains.Item;

/**
 *
 * @author salvador
 */
public class TestIn {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("criteria_samples");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Item> criteriaQuery = criteriaBuilder.createQuery(Item.class);
        Root<Item> root = criteriaQuery.from(Item.class);
        In<String> inClause = criteriaBuilder.in(root.get("itemName"));
        List<String> names = new ArrayList<>();
        names.add("item1");
        names.add("item2");

        for (String title : names) {
            inClause.value(title);
        }
        criteriaQuery.select(root).where(inClause);
        TypedQuery<Item> query=em.createQuery(criteriaQuery);
        List<Item> items=query.getResultList();
        
        for(Item item:items){
            System.out.println("itemName:"+item.getItemName()+ "precio:"+item.getItemPrice());
        }
       

    }
}
