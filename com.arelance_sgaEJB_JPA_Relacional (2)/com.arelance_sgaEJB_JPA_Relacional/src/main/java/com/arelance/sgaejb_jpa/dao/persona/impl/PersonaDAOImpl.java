/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.dao.persona.impl;

import com.arelance.sgaejb_jpa.dao.persona.PersonaDAO;
import com.arelance.sgajpa.domain.Persona;
import java.util.Iterator;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author salvador
 */
@Stateless
public class PersonaDAOImpl implements PersonaDAO {

    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Persona> listarPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaByID(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email= :email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void addPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void removePersona(Persona persona) {
        em.remove(em.merge(persona));
    }

    @Override
    public Persona findPersonaByID(int id) {
        return em.find(Persona.class, id);
    }

    @Override
    public Iterator<Object> datosResumenPersona() {
        String jpql = "SELECT min(p.idPersona)as idMinimo,max(p.idPersona), count(p) as totalPersonas, avg(p.edad) as promedio FROM Persona p";
        return em.createQuery(jpql).getResultList().iterator();

    }

    @Override
    public List<Persona> listarFiltroPersonas(String nombreParametro) {
        String jpql="SELECT p FROM Persona p WHERE p.nombre like :nombreParametro";
        Query q=em.createQuery(jpql);
        q.setParameter("nombreParametro", "%"+nombreParametro+"%");
        return  q.getResultList();
    }

}
