/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;


import com.arelance.empresa.imd.domain.Metodopagotransferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface MetodoPagoTransferenciaService {
    
    public List<Metodopagotransferencia> obtener();//Obtener todos los metodos de pago por transferencia
    
    public void AñadirPagoTransferencia(Metodopagotransferencia metodopagotransferencia);//Añadir un metodo de pago por transferencia

    public void ModificarPagoTransferencia(Metodopagotransferencia metodopagotransferencia);//Modificar un metodo de pago por transferencia

    public void RemoverPagoTransferencia(Metodopagotransferencia metodopagotransferencia);//Eliminar un metodo de pago por transferencia
    
}
