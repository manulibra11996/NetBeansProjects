/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author manuel
 */
@Model
public class Factura {

    @NotNull(message = "El cliente no puede ser nulo")
    private Cliente cliente;
    @NotNull(message = "El numedo de la factura no puede ser nulo")
    @Min(value = 1)
    private int numeroFactura;
    @NotNull(message = "El nombre de la factura no puede ser nulo")
    private String nombre;
    @NotNull(message = "La linea de la factura no puede ser nulo")
    private List<LineaFactura> lineaFactura;

    @Produces
    @Named
    @RequestScoped
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<LineaFactura> getLineaFactura() {
        return lineaFactura;
    }

    public void setLineaFactura(List<LineaFactura> lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

}
