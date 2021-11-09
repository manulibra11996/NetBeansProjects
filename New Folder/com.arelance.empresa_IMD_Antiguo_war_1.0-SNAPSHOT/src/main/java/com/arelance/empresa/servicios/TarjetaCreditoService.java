/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;


import com.arelance.empresa.imd.domain.Tarjetacredito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface TarjetaCreditoService {
    
   public List<Tarjetacredito> obtener();//Obtener todas las tarjetas

    public void AñadirTarjeta(Tarjetacredito tarjetaCredito);//Añadir una tarjeta

    public void ModificarTarjeta(Tarjetacredito tarjetacredito);//Modificar una tarjeta

    public void RemoverTarjeta(Tarjetacredito tarjetacredito);//Eliminar una tarjeta

    
}
