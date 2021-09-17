/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa;

import com.arelance.sgaejb_jpa.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.arelance.sgajpa.domain.Aficion;
import com.arelance.sgajpa.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Manuel
 */
public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) {
        if (persona.getAficiones() == null) {
            persona.setAficiones(new ArrayList<Aficion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Aficion> attachedAficiones = new ArrayList<Aficion>();
            for (Aficion aficionesAficionToAttach : persona.getAficiones()) {
                aficionesAficionToAttach = em.getReference(aficionesAficionToAttach.getClass(), aficionesAficionToAttach.getIdAficion());
                attachedAficiones.add(aficionesAficionToAttach);
            }
            persona.setAficiones(attachedAficiones);
            em.persist(persona);
            for (Aficion aficionesAficion : persona.getAficiones()) {
                Persona oldPersonaOfAficionesAficion = aficionesAficion.getPersona();
                aficionesAficion.setPersona(persona);
                aficionesAficion = em.merge(aficionesAficion);
                if (oldPersonaOfAficionesAficion != null) {
                    oldPersonaOfAficionesAficion.getAficiones().remove(aficionesAficion);
                    oldPersonaOfAficionesAficion = em.merge(oldPersonaOfAficionesAficion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getIdPersona());
            List<Aficion> aficionesOld = persistentPersona.getAficiones();
            List<Aficion> aficionesNew = persona.getAficiones();
            List<Aficion> attachedAficionesNew = new ArrayList<Aficion>();
            for (Aficion aficionesNewAficionToAttach : aficionesNew) {
                aficionesNewAficionToAttach = em.getReference(aficionesNewAficionToAttach.getClass(), aficionesNewAficionToAttach.getIdAficion());
                attachedAficionesNew.add(aficionesNewAficionToAttach);
            }
            aficionesNew = attachedAficionesNew;
            persona.setAficiones(aficionesNew);
            persona = em.merge(persona);
            for (Aficion aficionesOldAficion : aficionesOld) {
                if (!aficionesNew.contains(aficionesOldAficion)) {
                    aficionesOldAficion.setPersona(null);
                    aficionesOldAficion = em.merge(aficionesOldAficion);
                }
            }
            for (Aficion aficionesNewAficion : aficionesNew) {
                if (!aficionesOld.contains(aficionesNewAficion)) {
                    Persona oldPersonaOfAficionesNewAficion = aficionesNewAficion.getPersona();
                    aficionesNewAficion.setPersona(persona);
                    aficionesNewAficion = em.merge(aficionesNewAficion);
                    if (oldPersonaOfAficionesNewAficion != null && !oldPersonaOfAficionesNewAficion.equals(persona)) {
                        oldPersonaOfAficionesNewAficion.getAficiones().remove(aficionesNewAficion);
                        oldPersonaOfAficionesNewAficion = em.merge(oldPersonaOfAficionesNewAficion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = persona.getIdPersona();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getIdPersona();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            List<Aficion> aficiones = persona.getAficiones();
            for (Aficion aficionesAficion : aficiones) {
                aficionesAficion.setPersona(null);
                aficionesAficion = em.merge(aficionesAficion);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Persona findPersona(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
