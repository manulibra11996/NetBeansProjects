/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.imd.domain.Actividad;
import java.util.List;
import javax.inject.Inject;
import com.arelance.empresa.servicios.ActividadService;
import com.arelance.empresa.imd.dao.ActividadDAO;

/**
 *
 * @author lenovo
 */
public class ActividadServiceImpl implements ActividadService {

    @Inject
    private ActividadDAO actividadDAO;

    @Override
    public List<Actividad> ListarActividades() {
        return actividadDAO.ListarActividades();
    }

    @Override
    public Actividad EncontrarActividadPorID(Actividad actividad) {
        return actividadDAO.EncontrarActividadPorID(actividad);
    }

    @Override
    public Actividad EncontrarActividadPorID(int id) {
        return actividadDAO.EncontrarActividadPorID(id);
    }

    @Override
    public void AñadirActividad(Actividad actividad) {
        actividadDAO.AñadirActividad(actividad);
    }

    @Override
    public void ModificarActividad(Actividad actividad) {
        actividadDAO.ModificarActividad(actividad);
    }

    @Override
    public void RemoverActividad(Actividad actividad) {
        actividadDAO.RemoverActividad(actividad);
    }

    @Override
    public List<Actividad> ListaActividadesClienteTarjeta(int id_cliente) {
       return actividadDAO.ListaActividadesClienteTarjeta(id_cliente);
    }
    
    @Override
    public List<Actividad> ListaActividadesClienteTransferencia(int id_cliente) {
       return actividadDAO.ListaActividadesClienteTransferencia(id_cliente);
    }

}
