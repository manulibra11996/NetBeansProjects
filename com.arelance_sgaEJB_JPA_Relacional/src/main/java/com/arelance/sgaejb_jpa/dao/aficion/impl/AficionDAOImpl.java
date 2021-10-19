/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.dao.aficion.impl;

import com.arelance.sgaejb_jpa.dao.aficion.AficionDAO;
import com.arelance.sgajpa.domain.Aficion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
@Stateless
public class AficionDAOImpl implements AficionDAO {

    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;

    @Override
    public List<Aficion> listarAficiones() {
        return em.createNamedQuery("Aficion.findAll").getResultList();
    }

    @Override
    public Aficion findAficionByNombre(Aficion aficion) {
        Query query = em.createQuery("from Aficion a where a.nombre= :nombre");
        query.setParameter("nombre", aficion.getNombre());
        return (Aficion) query.getSingleResult();
    }

    @Override
    public Aficion findAficionByID(Aficion aficion) {
        return em.find(Aficion.class, aficion.getIdAficion());
    }

    @Override
    public Aficion findAficionByID(int id) {
        return em.find(Aficion.class, id);
    }

    @Override
    public void addAficion(Aficion aficion) {
        em.persist(aficion);
    }

    @Override
    public void updateAficion(Aficion aficion) {
        em.merge(aficion);
    }

    @Override
    public void removeAficion(Aficion aficion) {
        em.remove(em.merge(aficion));
    }

}
