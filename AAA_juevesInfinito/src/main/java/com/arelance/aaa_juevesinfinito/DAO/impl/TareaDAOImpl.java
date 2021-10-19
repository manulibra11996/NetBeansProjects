/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.DAO.impl;

import com.arelance.aaa_juevesinfinito.DAO.TareaDAO;
import com.arelance.aaa_juevesinfinito.domains.Tarea;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lenovo
 */
@Stateless
public class TareaDAOImpl implements TareaDAO {

    @PersistenceContext(unitName = "JavaAFondo")
    EntityManager em;

    @Override
    public List<Tarea> ListarTarea() {
        return em.createNamedQuery("Tarea.findAll").getResultList();
    }

    @Override
    public void AñadirTarea(Tarea tarea) {
        em.persist(tarea);
    }

    @Override
    public void ModificarTarea(Tarea tarea) {
        em.merge(tarea);
    }

    @Override
    public void RemoverTarea(Tarea tarea) {
        em.remove(em.merge(tarea));
    }

}
