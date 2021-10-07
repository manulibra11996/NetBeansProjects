/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.service;

import com.arelance.aaa_juevesinfinito.domains.Tarea;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface TareaService {

    public List<Tarea> ListarTarea();
    
    public void AñadirTarea(Tarea tarea);

    public void ModificarTarea(Tarea tarea);

    public void RemoverTarea(Tarea tarea);

}
