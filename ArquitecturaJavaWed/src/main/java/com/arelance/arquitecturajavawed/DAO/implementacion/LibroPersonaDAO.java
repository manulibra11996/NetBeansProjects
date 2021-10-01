/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.arquitecturajavawed.DAO.implementacion;

import com.arelance.arquitecturajavawed.DAO.ILibroPersonaDAO;
import com.arelance.arquitecturajavawed.DTO.LibroPersonaDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
@Stateless
public class LibroPersonaDAO implements ILibroPersonaDAO{

    @PersistenceContext(unitName = "UnidadPersona")
    EntityManager em;
    
    @Override
    public List<LibroPersonaDTO> obtener() {
        Query query = em.createQuery("select l from Persona p INNER JOIN p.libros l", LibroPersonaDTO.class);
        return (List<LibroPersonaDTO>) query.getResultList();
    }
    
}
