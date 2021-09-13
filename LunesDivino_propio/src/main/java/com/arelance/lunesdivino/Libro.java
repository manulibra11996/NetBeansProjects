/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino;

import java.util.Objects;

/**
 *
 * @author Manuel
 */
public final class Libro {
    
    private String titulo;
    private String ISBM;

    public Libro() {
    }

    public Libro(String titulo, String ISBM) {
        this.titulo = titulo;
        this.ISBM = ISBM;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the ISBM
     */
    public String getISBM() {
        return ISBM;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.ISBM);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.ISBM, other.ISBM)) {
            return false;
        }
        return true;
    }
    
    
}
