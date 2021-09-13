/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafinal.beans;

/**
 *
 * @author nators
 */
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gabri
 */
public final class Libro implements Comparable<Libro>, Serializable {

    private String titulo;
    private String ISBN;

    public Libro() {
    }

    public Libro(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        hash = 47 * hash + Objects.hashCode(this.ISBN);
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
        return Objects.equals(this.ISBN, other.ISBN);
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + '}';
    }

    @Override
    public int compareTo(Libro u) {
        int retorno = titulo.compareTo(u.titulo);
        if (retorno == 0) {
            retorno = ISBN.compareTo(u.ISBN);
        }
        return retorno;
    }
}
