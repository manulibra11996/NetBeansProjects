/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.service.impl;

import com.arelance.aaa_juevesinfinito.DAO.ProyectoDAO;
import com.arelance.aaa_juevesinfinito.domains.Proyecto;
import com.arelance.aaa_juevesinfinito.service.ProyectoService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class ProyectoServiceImpl implements ProyectoService {

    @Inject
    private ProyectoDAO proyectoDAO;

    @Override
    public List<Proyecto> ListarProyecto() {
        return proyectoDAO.ListarProyecto();
    }

    @Override
    public void AñadirProyecto(Proyecto proyecto) {
       proyectoDAO.AñadirProyecto(proyecto);
    }

    @Override
    public void ModificarProyecto(Proyecto proyecto) {
        proyectoDAO.ModificarProyecto(proyecto);
    }

    @Override
    public void RemoverProyecto(Proyecto proyecto) {
        proyectoDAO.RemoverProyecto(proyecto);
    }

}
