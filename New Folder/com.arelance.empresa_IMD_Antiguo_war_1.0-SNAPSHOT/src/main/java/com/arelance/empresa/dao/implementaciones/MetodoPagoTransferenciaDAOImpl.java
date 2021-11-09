/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.arelance.empresa.imd.dao.MetodoPagoTransferenciaDAO;
import com.arelance.empresa.imd.domain.Metodopagotransferencia;

/**
 *
 * @author lenovo
 */
@Stateless
public class MetodoPagoTransferenciaDAOImpl implements MetodoPagoTransferenciaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Metodopagotransferencia> obtener() {
        return em.createNamedQuery("Metodopagotransferencia.findAll").getResultList();
    }

    @Override
    public void AñadirPagoTransferencia(Metodopagotransferencia metodopagotransferencia) {
       em.persist(metodopagotransferencia);
    }

    @Override
    public void ModificarPagoTransferencia(Metodopagotransferencia metodopagotransferencia) {
        em.merge(metodopagotransferencia);
    }

    @Override
    public void RemoverPagoTransferencia(Metodopagotransferencia metodopagotransferencia) {
        em.remove(em.merge(metodopagotransferencia));
    }

}
