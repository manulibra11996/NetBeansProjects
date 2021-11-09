/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.dao.InscripcionTarjetaDAO;
import com.arelance.empresa.imd.domain.Inscripciontarjeta;
import com.arelance.empresa.imd.domain.Metodopagotarjeta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuar
 */
@Stateless
public class InscripcionTarjetaDAOImpl implements InscripcionTarjetaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Inscripciontarjeta> obtener() {
        return em.createNamedQuery("Inscripciontarjeta.findAll").getResultList();
    }

    @Override
    public void guardar(Inscripciontarjeta inscripciontarjeta) {
        em.persist(inscripciontarjeta);
    }

    @Override
    public void modificar(Inscripciontarjeta inscripciontarjeta) {
        em.merge(inscripciontarjeta);
    }

    @Override
    public void eliminar(Inscripciontarjeta inscripciontarjeta) {
        em.remove(em.merge(inscripciontarjeta));
    }

    @Override
    public Metodopagotarjeta ObtenerIdTarjeta() {
         String sql = "SELECT idmetodopagotarjeta FROM institutomd_bd.metodopagotarjeta order by idmetodopagotarjeta desc limit 1";
        return (Metodopagotarjeta) em.createNativeQuery(sql, Metodopagotarjeta.class).getSingleResult();
    }

}
