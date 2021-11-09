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
import com.arelance.empresa.imd.dao.TransferenciaDAO;
import com.arelance.empresa.imd.domain.Transferencia;
import javax.persistence.Query;

/**
 *
 * @author lenovo
 */
@Stateless
public class TransferenciaDAOImpl implements TransferenciaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Transferencia> obtener() {
        return em.createNamedQuery("Transferencia.findAll").getResultList();
    }

    @Override
    public void AñadirTransferencia(Transferencia transferencia) {
        em.persist(transferencia);
    }

    @Override
    public void ModificarTransferencia(Transferencia transferencia) {
        em.merge(transferencia);
    }

    @Override
    public void RemoverTransferencia(Transferencia transferencia) {
        em.remove(em.merge(transferencia));
    }

    @Override
    public Transferencia datosCliente(int id_cliente) {
        Query query = em.createQuery("select transferencia.iban from transferencia inner join metodopagotransferencia "
                + "on transferencia.id_transferencia = metodopagotransferencia.id_transferencia inner join inscripciontransferencia "
                + "on metodopagotransferencia.id_transferencia = inscripciontransferencia.id_metodopagotransferencia"
                + "where inscripciontransferencia.id_cliente = " + id_cliente, Transferencia.class);
        return (Transferencia) query.getSingleResult();
    }
}
