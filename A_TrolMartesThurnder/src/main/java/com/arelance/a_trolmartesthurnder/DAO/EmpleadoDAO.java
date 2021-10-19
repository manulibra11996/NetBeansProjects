/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolmartesthurnder.DAO;

import com.arelance.a_trolmartesthurnder.entity.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface EmpleadoDAO {

    public List<Empleado> ListarEmpleados();

    public void AñadirEmpleado(Empleado empleado);

    public void ModificarEmpleado(Empleado empleado);

    public void RemoverEmpleado(Empleado empleado);
    
    public Empleado BuscarId(int id);

}