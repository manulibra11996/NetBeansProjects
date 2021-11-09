/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.dao.InscripcionTransferenciaDAO;
import com.arelance.empresa.imd.domain.Inscripciontransferencia;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuar
 */
@Stateless
public class InscripcionTransferenciaDAOImpl implements InscripcionTransferenciaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Inscripciontransferencia> obtener() {
        return em.createNamedQuery("Inscripciontransferencia.findAll").getResultList();
    }

    @Override
    public void guardar(Inscripciontransferencia inscripciontransferencia) {
        em.persist(inscripciontransferencia);
    }

    @Override
    public void modificar(Inscripciontransferencia inscripciontransferencia) {
        em.merge(inscripciontransferencia);
    }

    @Override
    public void eliminar(Inscripciontransferencia inscripciontransferencia) {
        em.remove(em.merge(inscripciontransferencia));
    }

}
