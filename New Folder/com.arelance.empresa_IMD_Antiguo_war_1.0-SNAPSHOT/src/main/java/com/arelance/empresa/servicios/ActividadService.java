/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;

import com.arelance.empresa.imd.domain.Actividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lenovo
 */
@Local
public interface ActividadService {

    public List<Actividad> ListarActividades();//Obtener todas las actividades

    public Actividad EncontrarActividadPorID(Actividad actividad);//Encontrar actividad por id.
    
    public Actividad EncontrarActividadPorID(int id);//Encontrar actividad por id.
    
    public void AñadirActividad(Actividad actividad);//Añadir actividades.

    public void ModificarActividad(Actividad actividad);//Modificar actividades.

    public void RemoverActividad(Actividad actividad);//Remover actividades.
    
    public List<Actividad> ListaActividadesClienteTarjeta(int id_cliente);//Obtener las actividades que esta apuntado un usuario
    
    public List<Actividad> ListaActividadesClienteTransferencia(int id_cliente);//Obtener las actividades que esta apuntado un usuario

}
