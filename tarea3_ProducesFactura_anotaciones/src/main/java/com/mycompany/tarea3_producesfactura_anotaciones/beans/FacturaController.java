/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named(value = "facturaControler")
@RequestScoped
public class FacturaController {

    @Produces
    @Named
    @RequestScoped
    public Factura getFactura(@New Factura factura) {
        LineaFactura linea1 = new LineaFactura(15, 1, "figura");
        LineaFactura linea2 = new LineaFactura(20, 5, "balon");

        factura.setNombre("Factura Cliente " + factura.getCliente().nombreCompleto());
        factura.setNumeroFactura(507892);
        factura.addLineaFactura(linea1);
        factura.addLineaFactura(linea2);
//        factura.setCliente(cliente);

        return factura;
    }
}
