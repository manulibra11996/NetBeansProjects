/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolmartesthurnder.Service.implementacion;

import com.arelance.a_trolmartesthurnder.Service.EmpleadoService;
import com.arelance.a_trolmartesthurnder.entity.DAO.EmpleadoDAO;
import com.arelance.a_trolmartesthurnder.entity.Empleado;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class EmpleadoServiceImpl implements EmpleadoService {

    @Inject
    private EmpleadoDAO empleadoDAO;

    @Override
    public List<Empleado> ListarEmpleados() {
        return empleadoDAO.ListarEmpleados();
    }

    @Override
    public void AñadirEmpleado(Empleado empleado) {
        empleadoDAO.AñadirEmpleado(empleado);
    }

    @Override
    public void ModificarEmpleado(Empleado empleado) {
       empleadoDAO.ModificarEmpleado(empleado);
    }

    @Override
    public void RemoverEmpleado(Empleado empleado) {
        empleadoDAO.RemoverEmpleado(empleado);
    }

   
}
