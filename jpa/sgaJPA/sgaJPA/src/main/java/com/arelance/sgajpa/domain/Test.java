package com.arelance.sgajpa.domain;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salvador
 */
public class Test {
    static Logger log= LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("sgaPU");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        Persona persona=new Persona();
        persona.setNombre("Maria");
        persona.setApellido("perez");
        persona.setEmail("mperez@gmail.com");
        persona.setTelefono("666999888");
        log.debug("objeto a persistir"+persona);
        em.remove(persona);
        tx.commit();
        log.debug("objeto persistido"+persona);
        em.close();
    }
    
}
