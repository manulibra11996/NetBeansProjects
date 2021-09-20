/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.dao.filtro.impl;

import com.arelance.sgaejb_jpa.dao.filtro.FiltroDAO;
import java.util.Iterator;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
@Stateless
public class FiltroDAOImpl implements FiltroDAO {
    
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;

    @Override
    public Iterator<Object> datosResumenEdad(int min, int max) {
        String jpql = "SELECT avg(p.edad) as promedio FROM Persona p WHERE p.edad BETWEEN :min AND :max ";
        Query q=em.createQuery(jpql);
        q.setParameter("min", min);
        q.setParameter("max", max);
        return  q.getResultList().iterator();
    }
    
    
}
