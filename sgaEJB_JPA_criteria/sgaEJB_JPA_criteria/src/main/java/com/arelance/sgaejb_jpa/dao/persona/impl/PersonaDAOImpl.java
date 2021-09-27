/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.dao.persona.impl;

import com.arelance.sgaejb_jpa.dao.persona.PersonaDAO;
import com.arelance.sgajpa.domain.Persona;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
        //consulta de todas las  personas
        //1º
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persona> criteriaQuery = cb.createQuery(Persona.class);
        Root<Persona> fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        TypedQuery<Persona> query = em.createQuery(criteriaQuery);
        List<Persona> personas = query.getResultList();
        return personas;
    }

    @Override
    public Persona findPersonaByID(Persona persona) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persona> criteriaQuery = cb.createQuery(Persona.class);
        Root<Persona> fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        criteriaQuery.where(cb.equal(fromPersona.get("idPersona"), persona.getIdPersona()));

        TypedQuery<Persona> query = em.createQuery(criteriaQuery);

        return (Persona) query.getSingleResult();

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
    public List<Persona> findPersonaByID(int id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persona> criteriaQuery = cb.createQuery(Persona.class);
        Root<Persona> fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        TypedQuery<Persona> query = null;
        List<Predicate> criterios = new ArrayList<>();
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));
        if (criterios.size() == 1) {
            criteriaQuery.where(cb.and(criterios.get(0)));
        } else {
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }

        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", id);
        return query.getResultList();
    }

    @Override
    public Iterator<Object> datosResumenPersona() {
        String jpql = "SELECT min(p.idPersona)as idMinimo,max(p.idPersona), count(p) as totalPersonas FROM Persona p";
        return em.createQuery(jpql).getResultList().iterator();

    }

    @Override
    public List<Persona> listarFiltroPersonas(String nombreParametro) {
        String jpql = "SELECT p FROM Persona p WHERE p.nombre like :nombreParametro";

        Query q = em.createQuery(jpql);
        q.setParameter("nombreParametro", nombreParametro);
        return q.getResultList();
    }

}
