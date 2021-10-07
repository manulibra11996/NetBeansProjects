/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.DAO.impl;

import com.arelance.aaa_juevesinfinito.DAO.ProyectoDAO;
import com.arelance.aaa_juevesinfinito.domains.Proyecto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lenovo
 */
@Stateless
public class ProyectoDAOImpl implements ProyectoDAO {

    @PersistenceContext(unitName = "JavaAFondo")
    EntityManager em;

    @Override
    public List<Proyecto> ListarProyecto() {
        return em.createNamedQuery("Proyecto.findAll").getResultList();
    }

    @Override
    public void AñadirProyecto(Proyecto proyecto) {
        em.persist(proyecto);
    }

    @Override
    public void ModificarProyecto(Proyecto proyecto) {
        em.merge(proyecto);
    }

    @Override
    public void RemoverProyecto(Proyecto proyecto) {
        em.remove(em.merge(proyecto));
    }

   

}
