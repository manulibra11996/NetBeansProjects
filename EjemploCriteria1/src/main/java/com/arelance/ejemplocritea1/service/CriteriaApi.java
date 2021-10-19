/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocritea1.service;

import com.arelance.ejemplocritea1.domain.Departamentos;
import com.arelance.ejemplocritea1.domain.Empleados;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Manuel
 */
public class CriteriaApi {

    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("criteria");
        EntityManager entitymanager = emfactory.createEntityManager();

        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Empleados> criteriaQuery = criteriaBuilder.createQuery(Empleados.class);

        Root<Empleados> from = criteriaQuery.from(Empleados.class);

//        List<Order> orders = new ArrayList<Order>();
//        orders.add(criteriaBuilder.desc(from.get("ename")));
//        orders.add(criteriaBuilder.desc(from.get("salary")));
//        orders.add(criteriaBuilder.asc(from.get("deg")));
        Predicate[] predicates = new Predicate[2];
        predicates[0] = criteriaBuilder.gt(from.get("salary"), 30000);
        predicates[1] = criteriaBuilder.lt(from.get("salary"), 40000);
        System.out.println("Select all records");
        CriteriaQuery<Empleados> select = criteriaQuery.select(from);
        criteriaQuery.where(predicates);
        TypedQuery<Empleados> typedQuery = entitymanager.createQuery(select);
        List<Empleados> resultlist = typedQuery.getResultList();

        for (Empleados empleados : resultlist) {
            System.out.println("EID: " + empleados.getEid() + " Ename: " + empleados.getEname() + " Salary: " + empleados.getSalary() + " Deg: " + empleados.getDeg());
        }

        CriteriaQuery<Long> cr = criteriaBuilder.createQuery(Long.class);
        Root<Empleados> root = cr.from(Empleados.class);
        cr.select(criteriaBuilder.count(root));
        TypedQuery<Long> query = entitymanager.createQuery(cr);
        List<Long> itemProjected = query.getResultList();

        for (Long long1 : itemProjected) {
            System.out.println(long1);
        }

        CriteriaQuery<Double> cr2 = criteriaBuilder.createQuery(Double.class);
        Root<Empleados> root2 = cr2.from(Empleados.class);
        cr2.select(criteriaBuilder.avg(root2.get("salary")));
        TypedQuery<Double> query2 = entitymanager.createQuery(cr2);
        List<Double> avgItemPriceList = query2.getResultList();

        for (Double d : avgItemPriceList) {
            System.out.println(d);
        }

        CriteriaQuery<Object[]> c = criteriaBuilder.createQuery(Object[].class);
        Root<Empleados> emp = c.from(Empleados.class);
        Join<Empleados, Departamentos> project = emp.join("did");
        c.multiselect(emp, criteriaBuilder.count(project)).
                groupBy(emp.get("salary")).having(criteriaBuilder.ge(
                criteriaBuilder.count(project), 2));
        TypedQuery<Object[]> query3 = entitymanager.createQuery(c);
        List<Object[]> avgItemPriceList2 = query3.getResultList();

        for (Object[] objects : avgItemPriceList2) {
            System.out.println(objects);
        }
        CriteriaQuery<Long> cr3 = criteriaBuilder.createQuery(Long.class);
        Root<Empleados> root3 = cr3.from(Empleados.class);

        criteriaBuilder.sum(root3.get("salary"), 3000);
        cr3.select(criteriaBuilder.count(root3.get("deg"))).
                groupBy(root3.get("deg")).having();

        TypedQuery<Long> query4 = entitymanager.createQuery(cr3);
        List<Long> avgItemPriceList3 = query4.getResultList();

        for (Long l : avgItemPriceList3) {
            System.out.println(l);
        }

        entitymanager.close();
        emfactory.close();
    }
}
