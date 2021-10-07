/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.DAO;

import com.arelance.aaa_juevesinfinito.domains.Proyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface ProyectoDAO {

    public List<Proyecto> ListarProyecto();
    
    public void AñadirProyecto(Proyecto proyecto);

    public void ModificarProyecto(Proyecto proyecto);

    public void RemoverProyecto(Proyecto proyecto);

}
