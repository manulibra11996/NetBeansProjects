/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arquitecturajava.pruebas;

import com.mycompany.arquitecturajava.beans.Libro;
import com.mycompany.arquitecturajava.beans.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author manulibra
 */
public class Principal2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        List<Persona> lista = em.createQuery("select p from Persona p", Persona.class).getResultList();

        for (Persona p : lista) {

            System.out.println(p.getApellidos());
            for (Libro l : p.getLibros()) {

                System.out.println(l.getTitulo());
                System.out.println(l.getPaginas());

            }
        }
    }
}
