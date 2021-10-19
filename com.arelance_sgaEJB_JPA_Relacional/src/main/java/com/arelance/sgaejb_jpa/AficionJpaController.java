/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa;

import com.arelance.sgaejb_jpa.exceptions.NonexistentEntityException;
import com.arelance.sgajpa.domain.Aficion;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.arelance.sgajpa.domain.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Manuel
 */
public class AficionJpaController implements Serializable {

    public AficionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Aficion aficion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona = aficion.getPersona();
            if (persona != null) {
                persona = em.getReference(persona.getClass(), persona.getIdPersona());
                aficion.setPersona(persona);
            }
            em.persist(aficion);
            if (persona != null) {
                persona.getAficiones().add(aficion);
                persona = em.merge(persona);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Aficion aficion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Aficion persistentAficion = em.find(Aficion.class, aficion.getIdAficion());
            Persona personaOld = persistentAficion.getPersona();
            Persona personaNew = aficion.getPersona();
            if (personaNew != null) {
                personaNew = em.getReference(personaNew.getClass(), personaNew.getIdPersona());
                aficion.setPersona(personaNew);
            }
            aficion = em.merge(aficion);
            if (personaOld != null && !personaOld.equals(personaNew)) {
                personaOld.getAficiones().remove(aficion);
                personaOld = em.merge(personaOld);
            }
            if (personaNew != null && !personaNew.equals(personaOld)) {
                personaNew.getAficiones().add(aficion);
                personaNew = em.merge(personaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = aficion.getIdAficion();
                if (findAficion(id) == null) {
                    throw new NonexistentEntityException("The aficion with id " + id + " no longer exists.");
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
            Aficion aficion;
            try {
                aficion = em.getReference(Aficion.class, id);
                aficion.getIdAficion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The aficion with id " + id + " no longer exists.", enfe);
            }
            Persona persona = aficion.getPersona();
            if (persona != null) {
                persona.getAficiones().remove(aficion);
                persona = em.merge(persona);
            }
            em.remove(aficion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Aficion> findAficionEntities() {
        return findAficionEntities(true, -1, -1);
    }

    public List<Aficion> findAficionEntities(int maxResults, int firstResult) {
        return findAficionEntities(false, maxResults, firstResult);
    }

    private List<Aficion> findAficionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Aficion.class));
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

    public Aficion findAficion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Aficion.class, id);
        } finally {
            em.close();
        }
    }

    public int getAficionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Aficion> rt = cq.from(Aficion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
