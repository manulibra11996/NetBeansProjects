/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.arquitecturajavawed.DAO.implementacion;

import com.arelance.arquitecturajavawed.DAO.ILibroPersonaDAO;
import com.arelance.arquitecturajavawed.DTO.LibroPersonaDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
public class LibroPersonaDAO implements ILibroPersonaDAO{

    @PersistenceContext(unitName = "UnidadPersonas")
    EntityManager em;
    
    @Override
    public List<LibroPersonaDTO> obtener() {
        Query query = em.createQuery("select distinct new com.mycompany.arquitecturajava.DTO.LibroPersonaDTO(p.apellidos,l.titulo,l.paginas) from Persona p, Libro l");
        return (List<LibroPersonaDTO>) query.getResultList();
    }
    
}
