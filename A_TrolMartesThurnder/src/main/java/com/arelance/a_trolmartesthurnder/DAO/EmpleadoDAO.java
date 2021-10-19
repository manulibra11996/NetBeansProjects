/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.a_trolmartesthurnder.entity.DAO;

import com.arelance.a_trolmartesthurnder.entity.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface EmpleadoDAO {

    public List<Empleado> ListarEmpleados();//Obtener todas las actividades

    public void AñadirEmpleado(Empleado empleado);//Añadir actividades.

    public void ModificarEmpleado(Empleado empleado);//Modificar actividades.

    public void RemoverEmpleado(Empleado empleado);//Remover actividades.

}