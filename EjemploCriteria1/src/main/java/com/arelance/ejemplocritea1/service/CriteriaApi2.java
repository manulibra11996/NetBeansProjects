/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocritea1.service;

import com.arelance.ejemplocritea1.domain.Departamentos;
import com.arelance.ejemplocritea1.domain.Empleados;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Manuel
 */
public class CriteriaApi2 {

    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("criteria");
        EntityManager entitymanager = emfactory.createEntityManager();

        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Departamentos> criteriaQuery = criteriaBuilder.createQuery(Departamentos.class);

        Root<Departamentos> from = criteriaQuery.from(Departamentos.class);

        System.out.println("Select all records");
        CriteriaQuery<Departamentos> select = criteriaQuery.select(from);
        TypedQuery<Departamentos> typedQuery = entitymanager.createQuery(select);
        List<Departamentos> resultlist = typedQuery.getResultList();

        for (Departamentos departamentos : resultlist) {
            System.out.println("Nombre: " + departamentos.getNombre() + " Empleados: ");
            departamentos.getEmpleadosCollection().forEach((e) -> {
                System.out.println("Ename " + e.getEname());
            });
        }

        entitymanager.close();
        emfactory.close();
    }
}
