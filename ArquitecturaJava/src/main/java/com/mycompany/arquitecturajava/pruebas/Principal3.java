package com.mycompany.arquitecturajava.pruebas;

import com.mycompany.arquitecturajava.DTO.LibroPersonaDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manulibra
 */
public class Principal3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        List<LibroPersonaDTO> lista = em.createQuery("select distinct new com.mycompany.arquitecturajava.DTO.LibroPersonaDTO(p.apellidos,l.titulo,l.paginas) from Persona p, Libro l", LibroPersonaDTO.class).getResultList();
        for (LibroPersonaDTO dto : lista) {

            System.out.println(dto.getTitulo());
            System.out.println(dto.getPaginas());
            System.out.println(dto.getApellidos());
        }

    }
}
