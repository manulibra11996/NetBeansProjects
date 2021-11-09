/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.domain.Actividad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.arelance.empresa.imd.dao.ActividadDAO;

/**
 *
 * @author lenovo
 */
@Stateless
public class ActividadDAOImpl implements ActividadDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Actividad> ListarActividades() {
        return em.createNamedQuery("Actividad.findAll").getResultList();
    }

    @Override
    public Actividad EncontrarActividadPorID(Actividad actividad) {
        return em.find(Actividad.class, actividad.getIdActividad());
    }

    @Override
    public void AñadirActividad(Actividad actividad) {
        em.persist(actividad);
    }

    @Override
    public void ModificarActividad(Actividad actividad) {
        em.merge(actividad);
    }

    @Override
    public void RemoverActividad(Actividad actividad) {
        em.remove(em.merge(actividad));
    }

    @Override
    public Actividad EncontrarActividadPorID(int id) {
        return em.find(Actividad.class, id);
    }

    @Override
    public List<Actividad> ListaActividadesClienteTarjeta(int id_cliente) {
        String sql = "select a.id_actividad,a.nombre,a.descripcion,a.entrenador,a.precio,"
                + "a.dia_semana,a.hora_inicio,a.hora_fin from actividad a inner join inscripciontarjeta "
                + "on a.id_actividad = inscripciontarjeta.id_actividad inner join cliente "
                + "on inscripciontarjeta.id_cliente = cliente.id_cliente where cliente.id_cliente = " + id_cliente;
        return em.createNativeQuery(sql, Actividad.class).getResultList();
    }

    @Override
    public List<Actividad> ListaActividadesClienteTransferencia(int id_cliente) {
        String sql = "select a.id_actividad,a.nombre,a.descripcion,a.entrenador,a.precio,"
                + "a.dia_semana,a.hora_inicio,a.hora_fin from actividad a inner join  inscripciontransferencia "
                + "on a.id_actividad = inscripciontransferencia.id_actividad inner join cliente "
                + "on inscripciontransferencia.id_cliente = cliente.id_cliente where cliente.id_cliente = " + id_cliente;
        return em.createNativeQuery(sql, Actividad.class).getResultList();
    }

}
