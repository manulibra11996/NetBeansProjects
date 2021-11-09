/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;



import com.arelance.empresa.imd.domain.Metodopagotarjeta;
import com.arelance.empresa.imd.domain.Tarjetacredito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface MetodoPagoTarjetaService {
    
    public List<Metodopagotarjeta> obtener();//Obtener todos los metodos de pago por tarjeta
    
    public void AñadirPagoTarjeta(Metodopagotarjeta metodopagotarjeta);//Añadir un metodo de pago por tarjeta

    public void ModificarPagoTarjeta(Metodopagotarjeta metodopagotarjeta);//Modificar un metodo de pago por tarjeta

    public void RemoverPagoTarjeta(Metodopagotarjeta metodopagotarjeta);//Eliminar un metodo de pago por tarjeta
    
    public Tarjetacredito ObtenerIdTarjeta();//Obtener la id de la tarjeta
    
}
