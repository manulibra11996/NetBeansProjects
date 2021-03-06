/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3_producesfactura_anotaciones.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author manuel
 */
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

    @PostConstruct
    public void init() {
        lineaFactura = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Inject
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

    public void addLineaFactura(LineaFactura lineaFactura) {
        this.lineaFactura.add(lineaFactura);
    }

}
