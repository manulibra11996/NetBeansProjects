/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.arquitecturajavawed.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author manulibra
 */
@Entity
public class Libro {

    @Id
    private String titulo;
    private int paginas;
    @ManyToOne
    @JoinColumn(name = "persona_nombre")
    private Persona persona;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Libro(String titulo, int paginas, Persona persona) {
        super();
        this.titulo = titulo;
        this.paginas = paginas;
        this.persona = persona;
    }

    public Libro() {
        super();
    }

}
