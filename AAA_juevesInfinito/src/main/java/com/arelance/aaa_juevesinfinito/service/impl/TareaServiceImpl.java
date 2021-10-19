/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.service.impl;

import com.arelance.aaa_juevesinfinito.DAO.TareaDAO;
import com.arelance.aaa_juevesinfinito.domains.Tarea;
import com.arelance.aaa_juevesinfinito.service.TareaService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TareaServiceImpl implements TareaService {

    @Inject
    private TareaDAO tareaDAO;

    @Override
    public List<Tarea> ListarTarea() {
        return tareaDAO.ListarTarea();
    }

    @Override
    public void AñadirTarea(Tarea tarea) {
        tareaDAO.AñadirTarea(tarea);
    }

    @Override
    public void ModificarTarea(Tarea tarea) {
        tareaDAO.ModificarTarea(tarea);
    }

    @Override
    public void RemoverTarea(Tarea tarea) {
        tareaDAO.RemoverTarea(tarea);
    }

}
