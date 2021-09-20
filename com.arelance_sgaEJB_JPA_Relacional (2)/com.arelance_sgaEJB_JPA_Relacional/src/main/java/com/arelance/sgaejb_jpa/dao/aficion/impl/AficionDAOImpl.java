/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.dao.aficion.impl;

import com.arelance.sgajpa.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.arelance.sgaejb_jpa.dao.aficion.AficionDAO;
import com.arelance.sgajpa.domain.Aficion;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author salvador
 */
@Stateless
public class AficionDAOImpl implements AficionDAO {

    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;

    @Override
    public List<Aficion> listarAficiones() {
        return em.createNamedQuery("Aficion.findAll", Aficion.class).getResultList();
    }

    @Override
    public Aficion findAficionById(Aficion aficion) {
        return  em.find(Aficion.class, aficion.getIdAficion());
    }

    @Override
    public void addAficion(Aficion aficion) {
       Persona persona=em.merge(aficion.getPersona());
        em.persist(aficion);
        em.refresh(persona);
    }

    @Override
    public void updateAficion(Aficion aficion) {
      em.merge(aficion);
    }

    @Override
    public void removeAficion(Aficion aficion) {
       em.remove(em.merge(aficion));
    }

    @Override
    public Aficion findAficionById(Integer id) {
        return  em.find(Aficion.class, id);
    }

    @Override
    public Set<String> listarResumenAficiones() {
       String jpql="SELECT  concat(a.nombre,':',a.descripcion) as resumenAficion FROM Aficion as a";
       Set<String> lista=null;
       lista=new TreeSet<>(em.createQuery(jpql).getResultList());
       return lista;
    }
}
