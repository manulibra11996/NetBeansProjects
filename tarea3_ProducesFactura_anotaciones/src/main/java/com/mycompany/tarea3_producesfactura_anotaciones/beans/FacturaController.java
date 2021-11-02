/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named
@RequestScoped
public class FacturaController {

    private Factura factura;
    
    
    @PostConstruct
    public void init() {
         factura = new Factura();
        factura.getCliente().setNombre("Gabriel");
        factura.getCliente().setApellidos("Perez");
        factura.getCliente().setEmail("aaa@aaa.com");
        LineaFactura linea1 = new LineaFactura();
        linea1.setNombre_producto("figura");
        linea1.setPrecio(20);
        linea1.setCantidad(2);
        LineaFactura linea2 = new LineaFactura();
        linea2.setNombre_producto("balon");
        linea2.setPrecio(25);
        linea2.setCantidad(3);
        factura.getLineaFactura().add(linea1);
        factura.getLineaFactura().add(linea2);
        factura.setNombre("Factura de prueba");
        factura.setNumeroFactura(1);
    }

    @Produces
    @Named
    @RequestScoped
    public Factura crearFactura() {
        return factura;
    }
}
