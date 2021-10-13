/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocritea1.service;

import com.arelance.ejemplocritea1.domain.Empleados;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



/**
 *
 * @author Manuel
 */
public class CriteriaApi {

    public static void main(String[] args) {
//
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("criteria");
        EntityManager entitymanager = emfactory.createEntityManager();

        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Empleados> criteriaQuery = criteriaBuilder.createQuery(Empleados.class);

        Root<Empleados> from = criteriaQuery.from(Empleados.class);
//
//        System.out.println("Select all records");
//        CriteriaQuery<Empleados> select = criteriaQuery.select(from);
//        TypedQuery<Empleados> typedQuery = entitymanager.createQuery(select);
//        List<Empleados> resultlist = typedQuery.getResultList();
//
//        for (Empleados empleados : resultlist) {
//            System.out.println("EID: " + empleados.getEid() + "Ename: " + empleados.getEname());
//        }

        entitymanager.close();
        emfactory.close();
    }
}
